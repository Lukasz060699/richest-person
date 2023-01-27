package com.example.persons;

import android.app.Person;

import java.util.List;

public class JsonResponse {


    private List<PersonModel> people;

    public List<PersonModel> getPeople() {
        return people;
    }

    public void setPeople(List<PersonModel> people) {
        this.people = people;
    }
}
