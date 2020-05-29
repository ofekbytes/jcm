package jcm.examples.basic;

public class Ex_04_02_methodParameterArgument {
	
    // method with parameter/s //
	public int addMethod(int methodParameterOne, int methodParameterTwo) {
		return methodParameterOne + methodParameterTwo;
	}

	public static void main(String[] args) {

		int methodArgumentOne = 3;
		int methodArgumentTwo = 7;

		// calling method with argument //
		Ex_04_02_methodParameterArgument c = new Ex_04_02_methodParameterArgument();
		System.out.println(c.addMethod(methodArgumentOne, methodArgumentTwo));
	}

}
