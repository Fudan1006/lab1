package lab1;

/**
 * Created by wangxin on 16/3/13.
 */
public class Decaf extends CoffeeBeverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return super.cost() + 0.5;
    }
}
