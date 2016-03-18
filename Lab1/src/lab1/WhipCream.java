package lab1;

public class WhipCream extends BeverageWithIngredient {
//	public WhipCream(Beverage drink) {
//		super(drink);
//		description += " whip";
//	}
//
//	public double cost() {
//		return 0.3 + super.cost();
//	}
	Beverage beverage;
	
	public WhipCream(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " whip cream";
	}

	public double cost() {
		return 0.6 + beverage.cost();
	}
}
