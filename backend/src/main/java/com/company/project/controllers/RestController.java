package com.company.project.controllers;

import com.company.project.entity.Greeting;
import com.company.project.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Autowired
    private GreetingRepository repository;
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Greeting> showApi() {
        System.out.println("GET /all");
        List<Greeting> dockerGreeting = new ArrayList<>();
        repository.findAll().forEach(dockerGreeting::add);
        return dockerGreeting;
    }
}
