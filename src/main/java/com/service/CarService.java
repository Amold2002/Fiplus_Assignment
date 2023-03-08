package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Car;
import com.repo.CarRepo;

@Service
public class CarService implements CarServiceInterface {

	@Autowired
	private CarRepo carrepo;

	@Override
	public Car addCar(Car c) {
		Car saveCar = carrepo.save(c);
		return saveCar;
	}

	@Override
	public List<Car> getAllCar() {
		return carrepo.findAll();
	}

	@Override
	public Car getCarById(String model) {
		return carrepo.findById(model).get();
	}



}
