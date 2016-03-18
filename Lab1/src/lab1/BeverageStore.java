package lab1;

public class BeverageStore {
	Beverage order = null;

	public Beverage creatBeverage(String type, String size) {//use to decompose the order and create beverage
		if (type.equals("espresso")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
		} else if (type.equals("houseblend")) {
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(size);
		} else if (type.equals("mocha")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
			order = new Chocolate(order);
		} else if (type.equals("latte")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
			order = new Milk(order);
		} else if (type.equals("cappuccino")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
			order = new WhipCream(order);
		} else if (type.equals("decaf mocha")) {// add decaf mocha
			order = new Decaf();
			((CoffeeBeverage) order).setSize(size);
			order = new Chocolate(order);
		} else if (type.equals("green tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(size);
		} else if (type.equals("red tea")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(size);
		} else if (type.equals("white tea")) {
			order = new WhiteTea();
			((TeaBeverage) order).setSize(size);
		} else if (type.equals("flower tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(size);
			order = new Jasmine(order);
		} else if (type.equals("ginger tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(size);
			order = new Ginger(order);
		} else if (type.equals("tea latte")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(size);
			order = new Milk(order);
		}
		return order;
	}
}
