package lab1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
	static BeverageStore beverageStore ;//=new BeverageStore();
	public static void main(String[] args) {
		beverageStore =new BeverageStore();

//		String[] disArr = new String[args.length];
		int num = Character.isDigit(args[0].charAt(0)) ? Integer.parseInt(args[0]) : 1;
        ArrayList[] order = new ArrayList[num];
        for (int i = 0; i < num; i ++) {
        	order[i] = new ArrayList<String>();
        }
        num --;
        int j = Character.isDigit(args[0].charAt(0)) ? 1 : 0;
		for (; j < args.length; j++) {
//			disArr[j] = args[j].toLowerCase();
			if (!args[j].equals(";")) {
				order[num].add(args[j].toLowerCase());
			} else {
				num --;
			}
		}

		double total = 0.0;
		for (int i = 0; i < order.length; i ++) {
			String[] array =new String[order[i].size()];
	        order[i].toArray(array);
			total += calculate(array);
		}


//		if (Character.isDigit(disArr[0].charAt(0))) {
//			int s = 0;
//			for (int i = 1; i < disArr.length; i++) {
//				if (disArr[i].equals(";")) {
//					s++;
//					String[] temp = new String[i-s];
//					for (int m = 0; s < i; m++, s++) {
//						temp[m] = disArr[s];
//					}
//					total += calculate(temp);
//				}
//			}
//			s++;
//			String[] temp = new String[disArr.length-s];			
//			for (int m = 0; s < disArr.length; m++, s++) {
//				temp[m] = disArr[s];
//			}
//			total += calculate(temp);
//
//		} else {
//			total = calculate(disArr);
//		}
		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(total));
	}

	private static double calculate(String[] disArr) {
		int i;
		for (i = 0; i < disArr.length; i++)
			if (disArr[i].equals("small") || disArr[i].equals("medium")
					|| disArr[i].equals("large") || disArr[i].equals("grant"))//add grant
				break;

		
		if (i >= disArr.length) {
			System.out.println("Must set a size!");
			return -1;
		}

		String beveStr;
		if (i == 2) {
			beveStr = disArr[0] + " " + disArr[1];
		} else {
			beveStr = disArr[0];
		}
		

		Beverage order;
		/*if (beveStr.equals("espresso")) {
			order = new CoffeeBeverage();
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("houseblend")) {
			order = new CoffeeBeverage();
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("mocha")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
		} else if (beveStr.equals("latte")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else if (beveStr.equals("cappuccino")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new WhipCream(order);
		} else if (beveStr.equals("decaf mocha")) {//add decaf mocha
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
		} else if (beveStr.equals("green tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("red tea")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("white tea")) {
			order = new WhiteTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("flower tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Jasmine(order);
		} else if (beveStr.equals("ginger tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Ginger(order);
		} else if (beveStr.equals("tea latte")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else {
			System.out.println("Illegal beverage input: " + beveStr);
			return -1;
		}*/
		
		

			order = beverageStore.creatBeverage(beveStr,disArr[i]);
		if(order==null){
			System.out.println("Illegal beverage input: " + beveStr);
			return -1;
		}
		for (i++; i < disArr.length; i++) {
			if (disArr[i].equals("chocolate")) {
				order = new Chocolate(order);
			} else if (disArr[i].equals("ginger")) {
				order = new Ginger(order);
			} else if (disArr[i].equals("milk")) {
				order = new Milk(order);
			} else if (disArr[i].equals("jasmine")) {
				order = new Jasmine(order);
			} else if (disArr[i].equals("whip")) {
				i++;
				order = new WhipCream(order);
			} else {
				System.out.println("Illegal ingredient input: " + disArr[i]);
				return -1;
			}
		}

		/**
		 * How do I get the description of each order instead of doing this
		 * stupid thing forever (except for printing the args)?
		 */
//		if (order instanceof BeverageWithIngredient) {
//			((BeverageWithIngredient) order).getDescription();
//		} else if (order instanceof Espresso) {
//			((Espresso) order).getDescription();
//		}
		if (order instanceof Beverage) {
			((Beverage)order).getDescription();
		}
		// and so on...

		return order.cost();
	}
}
