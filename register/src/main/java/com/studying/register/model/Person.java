package com.studying.register.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "db_person")
public class Person {

    @Id
    private UUID id;
    @NotNull
    private String name;
    @NotNull
    private Date birth;


    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Person() {

    }
    public Person(UUID id) {
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(birth, person.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birth);
    }
}
