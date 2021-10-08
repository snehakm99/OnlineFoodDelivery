package com.demo.food.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.food.dao.IAddressDao;
//import com.demo.food.dao.IReviewDao;
import com.demo.food.entity.Address;
//import com.demo.food.entity.Review;
import com.demo.food.exception.AddressNotFoundException;

@Service
public class AddressServiceImpl implements IAddressService{
	@Autowired
	IAddressDao addressDao;

	
	@Override
	public List<Address> ListAllAddress() {
		return addressDao.findAll();
	}
	
     @Override
     public Address getAddressByAddressId(int addressId) throws AddressNotFoundException{
   	Optional<Address> address = addressDao.findById(addressId);
 	if(!address.isPresent()) {
			throw new AddressNotFoundException("Address not found with given rollNo "+addressId);
	}
 	return address.get();
	}
	
	@Override
	public Address addAddress(Address address) {
		return addressDao.save(address);
	}
	
	 @Override
	   public Address deleteAddressByAddress(int addressId) {
		 Address add = addressDao.findById(addressId).get();
		   addressDao.deleteById(addressId);
			return add;
		  
	 }
	 
	 @Override
  	public Address updateAddress(int addressId, Address address) {
		 Address adde = addressDao.findById(addressId).get();
		adde.setBuildingName(address.getBuildingName());
		adde.setArea(address.getArea());
		adde.setStreetNo(address.getStreetNo());
		adde.setCity(address.getCity());
		adde.setState(address.getState());
		adde.setCountry(address.getCountry());
		adde.setPincode(address.getPincode());
		return addressDao.save(adde) ;
		}

	

}
