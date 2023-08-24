package com.studying.register.controller;

import com.studying.register.dto.PersonDTO;
import com.studying.register.model.Person;
import com.studying.register.repository.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registers")
public class PersonController {

    @Autowired
    PersonRepository repository;

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody @Valid PersonDTO personDTO){
        var person = new Person();
        BeanUtils.copyProperties(personDTO, person);
        repository.save(person);

        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

}
