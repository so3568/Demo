package com.Demo.Basic1;

public class carDemoApp {

	public static void main(String[] args) {
		carDemo c = new carDemo();
		c.setColor("Red");
		c.setCarid(123);
		c.setCarAmount(1000);
		
		carDemo c1 = new carDemo("Yellow");
		
		
		
		System.out.println("Investement Percentage is" + c.investementpercentage());
		System.out.println("color is" + c.getColor());
		System.out.println("Carid is" + c.getCarid());
		System.out.println("car Amount is" + c.getCarAmount());
	}

}
