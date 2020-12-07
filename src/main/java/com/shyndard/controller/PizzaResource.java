package com.shyndard.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shyndard.entity.Pizza;
import com.shyndard.entity.dto.PizzaCreationDto;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/basics")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Pizza Resource", description = "Pizza management, endless pizzas !")
public class PizzaResource {

    private Map<UUID, Pizza> pizzas = new HashMap<>();
    
    @GET
    public Collection<Pizza> getAll() {
        return pizzas.values();
    }

    @POST
    public Pizza create(PizzaCreationDto pizzaCreationDto) {
        Pizza pizza = new Pizza();
        pizza.setId(UUID.randomUUID());
        pizza.setName(pizzaCreationDto.getName());
        pizza.setPrice(pizzaCreationDto.getPrice());
        pizzas.put(pizza.getId(), pizza);
        return pizza;
    }

    @PUT
    @Path("/{id}/burn")
    public Pizza set(@PathParam("id") UUID id) {
        return pizzas.get(id);
    }
}