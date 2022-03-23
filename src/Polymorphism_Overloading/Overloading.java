package Polymorphism_Overloading;

public class Overloading {

	public void overloading(String item, int calories, String tea, float cal) {

		System.out.println("BreakFast");
		System.out.println("=========");
		System.out.println(item);
		System.out.println(calories);
		System.out.println(tea);
		System.out.println(cal);
		System.out.println("**************************");

	}

	public void overloading(String menu, String fruit, float cal, int quantity) {

		System.out.println("Lunch");
		System.out.println("=========");
		System.out.println(menu);
		System.out.println(fruit);
		System.out.println(cal);
		System.out.println(quantity);
		System.out.println("**************************");

	}

	public void overloading(String menu, float cal, int quantity) {

		System.out.println("Dinner");
		System.out.println("=========");
		System.out.println(menu);
		System.out.println(cal);
		System.out.println(quantity);
		System.out.println("**************************");

	}

	public static void main(String[] args) {

		Overloading o = new Overloading();

		System.out.println("DIET CHART");
		System.out.println("******************");
		o.overloading("Idli", 25, "Green tea", 15.2f);
		o.overloading("meals", "apple", 50.34F, 2);
		o.overloading("Chappathi", 25.78F, 2);

	}

}
