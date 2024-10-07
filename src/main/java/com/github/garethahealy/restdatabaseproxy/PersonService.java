package com.github.garethahealy.restdatabaseproxy;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class PersonService {

    @Transactional
    public List<Person> get() {
        return Person.listAll();
    }
}
