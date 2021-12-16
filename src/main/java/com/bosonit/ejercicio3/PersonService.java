package com.bosonit.ejercicio3;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService implements PersonIntf {
    Person person = new Person();
    List<City> cities;

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setCities(List<City> cities){this.cities = cities;}
    public List<City> getCities(){return cities;}
}
