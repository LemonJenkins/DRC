package com.carsrace.DRC.Repository;

import com.carsrace.DRC.Entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {
}
