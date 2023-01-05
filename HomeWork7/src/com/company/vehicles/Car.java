package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    String modelCar;
    String autoClass;
    int weight;
    Driver driver;
    Engine motor;

    public Car(String modelCar, String autoClass, int weight, Driver driver, Engine motor){
        this.modelCar = modelCar;
        this.autoClass = autoClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }
    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public String toString(){
        return ("Авто: " + modelCar + "Класс: "+ autoClass +"Вес: " + weight + ", ФИО водителя: " + driver.name + driver.drivingEx + ", Мотор: " + motor.manufacturer + motor.power);
    }

}
