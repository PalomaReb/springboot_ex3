package com.bosonit.ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller1 {
    @Autowired
    PersonService personService;

    @Qualifier("bean1")
    @Autowired
    Person p1;

    @Qualifier("bean2")
    @Autowired
    Person p2;

    @Qualifier("bean3")
    @Autowired
    Person p3;



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

    @GetMapping("/controlador1/bean/{bean}")
    @ResponseBody
    public Person gettingBeans(@PathVariable String bean){
    switch(bean){
        case "bean1":return p1;
        case "bean2":return p2;
        case "bean3":return p3;
        default: return null;

    }
    }
}


