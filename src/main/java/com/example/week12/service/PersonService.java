package com.example.week12.service;

import com.example.week12.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();

    Person getPersonById(Integer id);
}
