package Hw12_1;

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
