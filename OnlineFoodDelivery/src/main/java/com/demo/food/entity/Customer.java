package com.demo.food.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name= "customer")

public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="customerId")
	private int customerId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private int age;
	@Column(name="mobileNumber")
	private String mobileNumber;
	@Column(name="caddress")
	private String caddress;
	@Column(name="email")
	private String email;
	
	@JsonIgnore
	//@OneToOne(targetEntity=Address.class, mappedBy= "customer")
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL)
	@JoinColumn(name="address")
	private List<Address> address=new ArrayList<>();
	
	
	
	public Customer(int customerId, String firstName, String lastName, String gender, int age, String mobileNumber,
			String caddress, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.caddress = caddress;
		this.email = email;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getCaddress() {
		return caddress;
	}



	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", age=" + age + ", mobileNumber=" + mobileNumber + ", caddress=" + caddress
				+ ", email=" + email + "]";
	}
	
	

			
}
