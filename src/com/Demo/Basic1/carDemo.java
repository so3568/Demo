package com.Demo.Basic1;

public class carDemo 
{
	private String color;
	private float carid;
	private int carAmount;
	
	
	  
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCarid() {
		return carid;
	}

	public void setCarid(float carid) {
		this.carid = carid;
	}

	public int getCarAmount() {
		return carAmount;
	}

	public void setCarAmount(int carAmount) {
		this.carAmount = carAmount;
	}

	public carDemo()
	{
		
	}
	
	public carDemo(String color){
		this.color = color;
	}

       public  int investementpercentage()
       {
	        int investementpercentage = (carAmount*10)/100;
	        return investementpercentage;
       }
}
