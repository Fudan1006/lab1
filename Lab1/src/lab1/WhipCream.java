package lab1;

public class WhipCream extends Ingredient {


	Beverage beverage;
	
	public WhipCream(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " Whip Cream";
	}

	public double cost() {
		return 0.3 + beverage.cost();
	}
}
