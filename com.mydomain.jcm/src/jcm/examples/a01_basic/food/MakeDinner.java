package jcm.examples.a01_basic.food;

public class MakeDinner {

	public MakeDinner() {
		System.out.println("::MakeDinner::");
		
		// call Main Method
		MakeAppetizer MakeAppetizer = new MakeAppetizer();
		MakeMainCourse makeMainCourse = new MakeMainCourse();
		MakeDessert makeDessert = new MakeDessert();

		// call Sub Method
		MakeRice makeRice = new MakeRice();
		MakeSchnitzel makeSchnitzel = new MakeSchnitzel();

	}

	public static void main(String[] args) {
		System.out.println("*****");
		new MakeDinner(); 
	}

}
