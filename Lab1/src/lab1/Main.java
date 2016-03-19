package lab1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
	static BeverageStore beverageStore;// =new BeverageStore();

	public static void main(String[] args) {
		int num = Character.isDigit(args[0].charAt(0)) ? Integer
				.parseInt(args[0]) : 1;
		ArrayList[] order = new ArrayList[num];
		for (int i = 0; i < num; i++) {
			order[i] = new ArrayList<String>();
		}
		num--;
		int j = Character.isDigit(args[0].charAt(0)) ? 1 : 0;
		for (; j < args.length; j++) {
			if (!args[j].equals(";")) {
				order[num].add(args[j].toLowerCase());
			} else {
				num--;
			}
		}

		double total = 0.0;
		for (int i = 0; i < order.length; i++) {
			String[] array = new String[order[i].size()];
			order[i].toArray(array);
			total += calculate(array);
		}

		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(total));

	}

	private static double calculate(String[] disArr) {
		int i;
		for (i = 0; i < disArr.length; i++)
			if (disArr[i].equals("small") || disArr[i].equals("medium")
					|| disArr[i].equals("large") || disArr[i].equals("grant"))// add
																				// grant
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
		beverageStore = new BeverageStore();	
		order = beverageStore.createBeverage(beveStr,disArr[i]);
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
		System.out.println(order.getDescription());

		return order.cost();
	}
}
