package lab1;

public class Milk extends Ingredient {
//	public Milk(Beverage drink) {
//		super(drink);
//		description += " milk";
//	}
//
//	public double cost() {
//		return 0.3 + super.cost();
//	}
	Beverage beverage;
	
	public Milk(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " milk";
	}

	public double cost() {
		return 0.6 + beverage.cost();
	}
}
