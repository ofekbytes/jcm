package jcm.examples.basic;

public class Ex_04_01_class_method {
	
	public static int number = 2;

	// constructor
	public Ex_04_01_class_method() {
		System.out.println("calculation constructor");
	}

	
	public int add (int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main (String [] args) {
		
		Ex_04_01_class_method c = new Ex_04_01_class_method();
		System.out.println(c.number);	
	}
	
}
