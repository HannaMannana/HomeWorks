package com.company.vehicles;


import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int load;

    public Lorry (String modelCar, String autoClass, int weight, Driver driver, Engine motor){
        super(modelCar,autoClass,weight, driver,motor);
        this.load = 130;
    }



}
