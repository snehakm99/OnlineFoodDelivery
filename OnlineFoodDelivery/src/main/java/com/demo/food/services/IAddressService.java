package com.demo.food.services;

import java.util.List;

import com.demo.food.entity.Address;
import com.demo.food.exception.AddressNotFoundException;

public interface IAddressService {

	List<Address> ListAllAddress();

	Address addAddress(Address address);

	Address deleteAddressByAddress(int addressId);

	Address updateAddress(int addressId, Address address);

	Address getAddressByAddressId(int addressId) throws AddressNotFoundException;

	//Address getAddressByAddressId(int addressId) throws AddressNotFoundException;

	//Address getAddressByAddressId(int addressId);

	//Address addAddress(Address address);

}
