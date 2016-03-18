package lab1;

public abstract class Beverage {
	protected SizeFactor sizeFactor;
	protected String description = "Unknown beverage";//make description for every subclass
	
	public abstract double cost();//make it abstract to enable implement rather than override
	
	public String getDescription(){
		return description;
	}
}
