package com.metazo.server.controller;

import com.metazo.server.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarController {
    @RequestMapping("/car")
    public Car getCar() {
        Car myCar = new Car("X6", "BMW", 2015, Car.Color.RED);
        return myCar;
    }
}
