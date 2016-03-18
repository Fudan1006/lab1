package lab1;

public class Ginger extends BeverageWithIngredient {
	Beverage beverage;
	
	public Ginger(Beverage drink) {
		beverage = drink;
	}
	
	public String getDescription(){		
		return beverage.getDescription() + " ginger";
	}

	public double cost() {
		return 0.6 + beverage.cost();
	}
//	public Ginger(Beverage drink) {
//		super(drink);
//		description += " ginger";
//	}
//	
//	public double cost() {
//		return 0.6 + super.cost();
//	}
}