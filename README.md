# sample-quarkus-restapi project

This is a sample project which uses Quarkus framework and Oracle GraamVM CE. 

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

Package project
```
./mvnw package
```
Run application
```
java -jar target/*-runner.jar
```
Add param '-Pnative' to build a native executable ( + add '-Dquarkus.native.container-build=true' if you don't have GraalVM installed)

## Creating a docker native image with GraalVM (with build step)

```
docker build -t sample-quarkus-restapi .
```
and then run it with
```
docker run -i --rm -p 8080:8080 -e PORT=8080 sample-quarkus-restapi
```

See https://quarkus.io/guides/building-native-image for more details.
