package jcm.examples.basic.food;

public class MakeDinner {

	public MakeDinner() {
	}

	public static void main(String[] args) {
		System.out.println("::MakeDinner::");
		
		// call Main Method
		MakeAppetizer MakeAppetizer = new MakeAppetizer();
		MakeMainCourse makeMainCourse = new MakeMainCourse();
		MakeDessert makeDessert = new MakeDessert();

		// call Sub Method
		MakeRice makeRice = new MakeRice();
		MakeSchnitzel makeSchnitzel = new MakeSchnitzel();

	}

}
