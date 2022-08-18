package com.example.week12.repository;

import com.example.week12.model.Person;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {
    private List<Person> personList;

    @PostConstruct
    public void generateData() {
        personList = new ArrayList<>();
        personList.add(new Person(1, "Smith", 20, Arrays.asList("Football", "Swimming")));
        personList.add(new Person(6, "Johnson", 27, Arrays.asList("Biking", "Billiards")));
        personList.add(new Person(3, "Williams", 14, Arrays.asList("Magic", "Chess Playing")));
        personList.add(new Person(2, "Brown", 29, Arrays.asList("Martial Arts", "Painting")));
        personList.add(new Person(4, "Jones", 45, Arrays.asList("Camping", "Rapping")));
        personList.add(new Person(5, "Walker", 17, Arrays.asList("Birding", "Gym", "Cooking")));
    }

    public List<Person> getAllPersons() {
        return personList;
    }

    public Person getPersonById(Integer id) {
        Person person = null;
        for (Person p: personList) {
            if (p.getId() == id)
                person = p;
        }
        return person;
    }
}
