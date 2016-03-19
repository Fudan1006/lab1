package lab1;


public class Chocolate extends Ingredient {
	Beverage beverage;
	
	public Chocolate(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " Chocolate";
	}

	public double cost() {
		return 0.3 + beverage.cost();
	}
}
