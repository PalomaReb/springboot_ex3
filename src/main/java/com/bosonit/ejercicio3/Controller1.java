package com.bosonit.ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;


@RestController
public class Controller1 {
    @Autowired
    PersonService personService;

    @GetMapping("/controlador1/addPersona")
    public void setPerson(@RequestParam(value = "name") String name,
                            @RequestParam(value = "city") String city,
                            @RequestParam(value = "age") Integer age) {
        personService.setPerson(new Person(name, city, age));
        System.out.print("haciendo un print desde getPerson");
    }


    @PostMapping("/controlador1/addCiudad")
    @ResponseBody
    public void addCity(@RequestBody City city){
        personService.getCities().add(city);
    }
}


