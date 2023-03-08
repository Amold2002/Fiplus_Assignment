package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.entity.Car;


public interface CarRepo extends JpaRepository<Car, String>{

	
}
