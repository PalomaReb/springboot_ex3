package com.bosonit.ejercicio3;

public class Person {
    private String name;
    private String city;
    private Integer age;

    public Person(){

}
    public Person (String name, String city, Integer age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
