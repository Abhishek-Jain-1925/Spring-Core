package com.test4;

public class student {
	int roll;
	String name,address;
	
	public student() {
		super();
		// TODO Auto-generated constructor stuff
	}

	public student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}	

	@Override
	public String toString() {
		return "student [Roll=" + roll + ", Name=" + name + ", Address=" + address + "]";
	}
}
