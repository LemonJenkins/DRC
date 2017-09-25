package com.carsrace.DRC.Controller;

import com.carsrace.DRC.Entity.Car;
import com.carsrace.DRC.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {this.carRepository = carRepository;}

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Car> getAllUsers() {return carRepository.findAll();}

    @GetMapping(path = "/{id}")
    public @ResponseBody Car getCarbyId(@PathVariable Integer id) {return carRepository.findOne(id);}
}
