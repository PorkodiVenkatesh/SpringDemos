package com.revature.SpringFrameWorkDemo;

public class Tyre {
	
	String brand; //property

	public Tyre() {}
	public String getBrand() {
		return brand;
	}
 //<property name="brand"  value= "MRF"></property> ---> Setter Injection
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Setter Injection");
	}

	public Tyre(String brand) {
		super();
		this.brand = brand;
		System.out.println("Constructor Injection");
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	

}
