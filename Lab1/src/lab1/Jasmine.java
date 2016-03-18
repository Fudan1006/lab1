package lab1;

public class Jasmine extends Ingredient {
//	public Jasmine(Beverage drink) {
//		super(drink);
//		description += " jasmine";
//	}
//
//	public double cost() {
//		return 0.5 + super.cost();
//	}
	Beverage beverage;
	
	public Jasmine(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " Jasmine";
	}

	public double cost() {
		return 0.6 + beverage.cost();
	}
}
