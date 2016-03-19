package lab1;


public class Milk extends Ingredient {


	Beverage beverage;
	
	public Milk(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " Milk";
	}

	public double cost() {
		return 0.3 + beverage.cost();
	}
}
