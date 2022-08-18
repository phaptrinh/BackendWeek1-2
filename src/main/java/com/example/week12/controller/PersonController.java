package com.example.week12.controller;

import com.example.week12.model.Person;
import com.example.week12.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("")
    public String getAllPerson(Model model) {
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        return "personTemplate";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> getPersonById(@PathVariable("id") Integer id) {
        Person person = personService.getPersonById(id);
        if (person != null) {
            return ResponseEntity.ok(person);
        }
        return ResponseEntity.badRequest().body("Not found person with id: " + id);
    }
}
