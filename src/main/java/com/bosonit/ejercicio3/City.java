package com.bosonit.ejercicio3;

//import org.springframework.stereotype.Component;

//@Component
public class City {
private String name;
private int population;


public City(){

}

public City (String name, int population){
    this.name = name;
    this.population = population;
}
public String getName(){
    return name;
}

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
}

    public void setPopulation(int population) {
        this.population = population;
    }
}
