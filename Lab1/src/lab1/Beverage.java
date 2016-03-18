package lab1;

public class Beverage {
	protected SizeFactor sizeFactor;
	protected String description;//make description for every subclass

	
	public double cost() {
		return 0;
	}
	
	public String getDescription(){
		return description;
	}
}
