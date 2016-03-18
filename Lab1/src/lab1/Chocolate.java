package lab1;

public class Chocolate extends Ingredient {
//	public Chocolate(Beverage drink) {
//		super(drink);
//		description += " chocolate";
//	}
//
//	public double cost() {
//		return 0.3 + super.cost();
//	}
	Beverage beverage;
	
	public Chocolate(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " chocolate";
	}

	public double cost() {
		return 0.3 + beverage.cost();
	}
}
