package kea.exercise.person.controller;


import kea.exercise.person.model.Person;
import kea.exercise.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        List<Person> persons = personRepository.findAll();

        return persons;
    }
}
