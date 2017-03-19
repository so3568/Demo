package com.Demo.Basic1;

public class Application {

	public static void main(String[] args) {
		int Amount = 100;
		System.out.println("Amount is" + Amount);
		add(1,2);
		sub(2,1);

	}
		public static void add(int x, int y)
		{
			int z= x+y;
			System.out.println("The addition of two numbers is" + z);
		}
		public static int sub(int a, int b){
			int c = a-b;
			return c;
			
		}
	

	
	

}
