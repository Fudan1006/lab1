package lab1;

public abstract class Beverage {
	protected SizeFactor sizeFactor;
	protected String description;//make description for every subclass

	public abstract double cost();
	public String getDescription(){
		return description;
	}
}
