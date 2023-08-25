package com.studying.register.controller;

import com.studying.register.dto.PersonDTO;
import com.studying.register.model.Person;
import com.studying.register.repository.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping
    public ResponseEntity getAll(){
        List<Person> person = repository.findAll();
        return ResponseEntity.ok(person);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable UUID id){
        Optional<Person> person = repository.findById(id);

        return ResponseEntity.ok(person);
    }

    @PutMapping("/{id}")
    public ResponseEntity update (@PathVariable UUID id, @RequestBody PersonDTO updatedPerson){
        Optional<Person> personToUpdate = repository.findById(id);
        var person = personToUpdate.get();
        BeanUtils.copyProperties(updatedPerson, person);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(person));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable UUID id){
        Optional<Person> person = repository.findById(id);
        repository.delete(person.get());

        return ResponseEntity.ok("The person was successfully deletes!");
    }
}
