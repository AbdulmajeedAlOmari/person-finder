package dev.alomari.person.finder.controllers;

import dev.alomari.person.finder.beans.Person;
import dev.alomari.person.finder.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class IndexController {

    private PersonService personService;

    @Autowired
    public IndexController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{personId}")
    public Person findPerson(@PathVariable Long personId) {
        return personService.findPerson(personId);
    }
}
