package jcm.examples.a01_basic;

public class Ex_05_01_methodReturnVoid {

	public Ex_05_01_methodReturnVoid() { }
	
	public void PrintOrder() {
		System.out.println("Print Order");
	}
	
	public static void main(String [] args) {
		
		Ex_05_01_methodReturnVoid mrv = new Ex_05_01_methodReturnVoid();
		mrv.PrintOrder();
	}
}
