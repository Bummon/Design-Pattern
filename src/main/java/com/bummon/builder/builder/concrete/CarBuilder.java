package com.bummon.builder.builder.concrete;

import com.bummon.builder.builder.Builder;
import com.bummon.builder.entity.Car;

/**
 * @author Bummon
 * @description
 * @date 2023-08-14 15:42
 */
public class CarBuilder implements Builder<Car> {

    private Car car = new Car();

    public CarBuilder engine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder wheel(String wheel) {
        car.setWheel(wheel);
        return this;
    }

    public CarBuilder cylinder(String cylinder) {
        car.setCylinder(cylinder);
        return this;
    }

    public CarBuilder color(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return this.car;
    }
}
