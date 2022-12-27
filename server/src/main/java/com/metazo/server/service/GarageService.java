package com.metazo.server.service;

import com.metazo.server.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1,"X6", "BMW", 2015, Car.Color.RED),
            new Car(2,"X6", "BMW", 2015, Car.Color.RED),
            new Car(3,"X6", "BMW", 2015, Car.Color.RED),
            new Car(4,"X6", "BMW", 2015, Car.Color.RED),
            new Car(5,"X6", "BMW", 2015, Car.Color.RED)
    ));

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(long id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    public void deleteCar(long id) {
        cars.removeIf(car -> car.getId() == id);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void updateCar(Car car, long id) {
        cars.forEach(car1 -> {
            if(car1.getId() == id) {
                cars.set(cars.indexOf(car1),car );
            }
        });
    }
}
