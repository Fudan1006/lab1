package lab1;

public class Jasmine extends Ingredient {

	Beverage beverage;
	
	public Jasmine(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " Jasmine";
	}

	public double cost() {
		return 0.5 + beverage.cost();
	}
}
