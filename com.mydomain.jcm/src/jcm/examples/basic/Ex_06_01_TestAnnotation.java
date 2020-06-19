package jcm.examples.basic;

import jcm.examples.Test;

public class Ex_06_01_TestAnnotation {

	
	
	@Test
	public void print() {
		System.out.println("@Test Annotation");
	}
	
	///---[constructor]---- 
	public Ex_06_01_TestAnnotation() {	}

	public static void main (String [] args) {
		Car car = new Car();
		car.speed(120);
	}
}
