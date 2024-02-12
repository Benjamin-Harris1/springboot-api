package kea.exercise.person.controller;


import kea.exercise.person.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public List<Person> getAllPersons(){

        var person1 = new Person();
        person1.setId(1);
        person1.setFirstName("dummy");
        person1.setLastName("test");
        person1.setDateOfBirth(LocalDate.parse("1970-01-01"));

        var person2 = new Person();
        person2.setId(2);
        person2.setFirstName("dummy2");
        person2.setLastName("test2");
        person2.setDateOfBirth(LocalDate.parse("1970-01-01"));

        var person3 = new Person();
        person3.setId(3);
        person3.setFirstName("dummy3");
        person3.setLastName("test3");
        person3.setDateOfBirth(LocalDate.parse("1970-01-01"));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        return persons;
    }
}
