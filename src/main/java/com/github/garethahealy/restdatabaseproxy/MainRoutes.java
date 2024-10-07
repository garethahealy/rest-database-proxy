package com.github.garethahealy.restdatabaseproxy;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

@ApplicationScoped
public class MainRoutes extends RouteBuilder {

    @Inject
    PersonService personService;

    @Override
    public void configure() throws Exception {
        rest("/persons")
                .get("/list").to("direct:getPersons");

        from("direct:getPersons")
                .bean(personService, "get")
                .marshal().json(JsonLibrary.Jackson);
    }
}
