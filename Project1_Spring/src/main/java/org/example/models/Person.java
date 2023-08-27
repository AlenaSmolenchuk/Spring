package org.example.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Person {

    private int personId;

    @NotEmpty(message = "FIO should not be empty")
    @Size(min = 3, max = 124, message = "FIO should be between 3 and 124 characters")
    private String fio;


    @NotNull(message = "birthdayYear should not be null")
    private int birthdayYear;

    public Person() {}

    public Person(int personId, String fio, int birthdayYear) {
        this.personId = personId;
        this.fio = fio;
        this.birthdayYear = birthdayYear;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }
}
