package lab1;

public class Espresso extends CoffeeBeverage {	
	public Espresso() {
		description = "Espresso";
	}


	public double cost() {
		return super.cost() + 1.0;
	}
}
