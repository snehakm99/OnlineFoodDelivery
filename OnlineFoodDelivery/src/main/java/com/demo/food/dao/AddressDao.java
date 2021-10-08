package com.demo.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.food.entity.Customer;

public interface AddressDao extends JpaRepository<Customer, Integer>{
	
	Customer findByFirstName(String firstName);
	
}
