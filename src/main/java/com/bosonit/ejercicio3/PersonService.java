package com.bosonit.ejercicio3;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService implements PersonIntf {
    Person person = new Person();
    List<City> city;

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setCity(List<City> city){this.city = city;}
    public List<City> getCity(){return city;}
}
