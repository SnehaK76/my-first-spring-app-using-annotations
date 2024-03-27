package com.prowings.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value( value = "10")
	private int roll;
	@Value( value = "Sneha")
	private String name;
	@Autowired
	@Qualifier("addr1")
	private Address address;
	
	public Student() {
		super();
	}
	public int getRoll() {
		return roll;
	}
//	@Autowired
	public Student(Address address) {
		super();
		System.out.println("Address injected through constructor");
		this.address = address;
	}
	public void setRoll(int roll) {
		System.out.println("Roll no injected by setter method");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name injected by setter method");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	// @Autowired
	public void setAddress(Address address) {
		System.out.println("Address injected by setter method");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
}
