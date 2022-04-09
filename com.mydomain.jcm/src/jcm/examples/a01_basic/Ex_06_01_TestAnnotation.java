package jcm.examples.a01_basic;

import org.junit.Test;

import jcm.examples.b02_BasicJavaKeywords.test.b02Test;

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
		
		Car secondCar = new Car();
		secondCar.speed(100);
		
		Car thirdCar = new Car();
		thirdCar.speed(140);
		
		Car testCar = new Car(120);
		
	}
}
