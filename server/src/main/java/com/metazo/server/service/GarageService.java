package com.metazo.server.service;

import com.metazo.server.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("X6", "BMW", 2015, Car.Color.RED),
            new Car("X6", "BMW", 2015, Car.Color.RED),
            new Car("X6", "BMW", 2015, Car.Color.RED),
            new Car("X6", "BMW", 2015, Car.Color.RED),
            new Car("X6", "BMW", 2015, Car.Color.RED)
    ));

    public List<Car> getCars() {
        return cars;
    }
}
