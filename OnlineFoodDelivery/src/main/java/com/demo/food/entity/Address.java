package com.demo.food.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "addressId")
	private int addressId;
	@Column(name = "buildingName")
	private String buildingName;
	@Column(name = "area")
	private String area;
	@Column(name = "streetNo")
	private int streetNo;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "pincode")
	private String pincode;
	
	
	@OneToOne
	@JoinColumn(name = "customer_fk")
	private Customer customer;
	
	
	
	public Address(int addressId, String buildingName, String area, int streetNo, String city, String state,
			String country, String pincode) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.area = area;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingName=" + buildingName + ", area=" + area + ", streetNo="
				+ streetNo + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ "]";
	}
	
	
	
	
	
	
	
	
}