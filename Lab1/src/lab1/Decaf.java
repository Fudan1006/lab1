package lab1;

/**
 * Created by wangxin on 16/3/13.
 */
public class Decaf extends CoffeeBeverage {
    //private String description;

    public Decaf() {
        description = "Decaf";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return super.cost() + 0.5;
    }
}
