package com.blackoperations.treadstone.controller;

import com.blackoperations.treadstone.domain.Person;
import com.blackoperations.treadstone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/api/person")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    @RequestMapping(value = "/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }
}
