package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class mainCar {
    public static void main(String[] args) {

        Driver driver = new Driver("Иванов И.А.", " 10 лет");
        Engine engine = new Engine(" 1200 ", "Германия, ");
        Car car = new Car("Nisan, ", "Cтандарт, ", 2500, driver, engine);

        car.turnRight();
        car.stop();
        car.start();
        System.out.println(car);
    }
}
