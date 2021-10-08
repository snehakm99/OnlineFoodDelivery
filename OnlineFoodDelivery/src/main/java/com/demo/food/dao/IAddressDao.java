package com.demo.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.food.entity.Address;

public interface IAddressDao extends JpaRepository<Address, Integer> {

}
