package lab1;

public class Ginger extends Ingredient {
	Beverage beverage;
	
	public Ginger(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " Ginger";
	}

	public double cost() {
		return 0.6 + beverage.cost();
	}
}
