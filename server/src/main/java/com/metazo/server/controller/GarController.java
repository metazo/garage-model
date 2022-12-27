package com.metazo.server.controller;

import com.metazo.server.model.Car;
import com.metazo.server.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarController {
    @Autowired
    private GarageService garageService;
    @RequestMapping("/cars")
    public List<Car> getCars() {
        return garageService.getCars();
    }
    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id) {
        return garageService.getCar(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable long id) {
        garageService.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/car")
    public void addCar(@RequestBody Car car) {
        garageService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void updateCar(@RequestBody Car car,@PathVariable long id) {
        garageService.updateCar(car, id);
    }
}
