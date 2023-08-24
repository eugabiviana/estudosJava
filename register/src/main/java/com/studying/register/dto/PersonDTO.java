package com.studying.register.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class PersonDTO {

    @NotNull
    private String name;
    @NotNull
    private Date birth;

    public PersonDTO() {

    }

    public PersonDTO(@NotNull String name, @NotNull Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
