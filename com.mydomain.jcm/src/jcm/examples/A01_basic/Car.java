package jcm.examples.A01_basic;

import jcm.examples.Test;

public class Car {

	///---[constructor]---- 
	public Car() {	}
	
	///---[constructor with method parameters]---- 
	public Car(int speed) { System.out.println("speed: " + speed ); }
	
	@Test  
	public void speed(int speed) {
		System.out.println("Car Speed is: " + speed);		
	}

}
