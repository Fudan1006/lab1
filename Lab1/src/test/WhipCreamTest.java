package test;

import lab1.CoffeeBeverage;
import lab1.Espresso;
import lab1.WhipCream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class WhipCreamTest {
    WhipCream w;
    @Before
    public void SetUp() throws Exception{
        CoffeeBeverage c = new Espresso();
        c.setSize("small");
        w = new WhipCream(c);//cappuccino

    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Espresso Whip Cream", w.getDescription());//the description of cappuccino
    }

    @Test(timeout = 1000)
    public void testCost(){
        Assert.assertEquals(1.7, w.cost(), 0.001);//the cost of cappuccino
    }
}
