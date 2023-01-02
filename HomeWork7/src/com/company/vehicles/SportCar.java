package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    int speed;
    public SportCar (String modelCar, String autoClass, int weight, Driver driver, Engine motor){
        super(modelCar,autoClass,weight, driver,motor);
        this.speed = 300;
    }
}
