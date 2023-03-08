package com.service;

import java.util.List;

import com.entity.Car;

public interface CarServiceInterface {

	Car addCar(Car c);

	List<Car> getAllCar();

	Car getCarById(String model);

	
}
