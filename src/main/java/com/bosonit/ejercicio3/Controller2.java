package com.bosonit.ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller2 {
    @Autowired
    PersonService personService;


    @GetMapping("/controlador2/getPersona")
    public Person getPerson(){
        int doubleDeLaEdad = personService.getPerson().getAge()*2;
        personService.getPerson().setAge(doubleDeLaEdad);
        return personService.getPerson();
    }

    @GetMapping("/controlador2/getCiudad")
    public List<City>city(){
        return personService.getCities();
    }

}
