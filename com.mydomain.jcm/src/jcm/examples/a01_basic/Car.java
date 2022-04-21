package jcm.examples.a01_basic;

import org.junit.Test;

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
