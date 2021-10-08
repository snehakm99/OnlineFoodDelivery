package com.demo.food.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.food.entity.Customer;
import com.demo.food.entity.Address;


@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer> {
		
	//@Query("Select c from Customer c inner join ")
	List<Customer> viewAllCustomerByAddress(@Param("addressId")String addressId);
	
	Optional<Customer> findByFirstName(String firstName);

}
