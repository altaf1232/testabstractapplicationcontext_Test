package com.springcore3;

public class TestAbstractApplicationContext 
{
   private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public TestAbstractApplicationContext() {
	super();
	// TODO Auto-generated constructor stub
}

public TestAbstractApplicationContext(double price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "TestAbstractApplicationContext [price=" + price + "]";
}
 public void init() 
 {
	 System.out.println("inside to intit()");  
 }
 public void destory() 
 {
	 System.out.println("inside to destory()");
 }
}
