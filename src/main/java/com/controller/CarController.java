package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Car;
import com.service.CarServiceInterface;

@RestController
public class CarController {

	@Autowired
	private CarServiceInterface CarServiceInterface;

	@PostMapping("/car")
	public ResponseEntity<Car> addCar(@RequestBody Car c) {

		
		Car carSaved = CarServiceInterface.addCar(c);

		return new ResponseEntity<Car>(carSaved, HttpStatus.CREATED);
	}

	@GetMapping("/car/{model}")
	public ResponseEntity<Car> getEmpById(@PathVariable("model") String model) {
		Car car = CarServiceInterface.getCarById(model);

		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}

	@GetMapping("/car")
	public ResponseEntity<List<Car>> getAllCars() {
		List<Car> listOfAllCars = CarServiceInterface.getAllCar();

		return new ResponseEntity<List<Car>>(listOfAllCars, HttpStatus.OK);
	}

	@PutMapping("/car")
	public ResponseEntity<Car> updateCar(@RequestBody Car car) {

		Car employeeSaved = CarServiceInterface.addCar(car);

		return new ResponseEntity<Car>(employeeSaved, HttpStatus.CREATED);
	}

}
