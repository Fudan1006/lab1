package test;

import lab1.Espresso;
import org.junit.Assert;
import lab1.BeverageStore;
import lab1.Chocolate;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class ChocolateTest {
    Chocolate c0;
    @Before
    public void SetUp() throws Exception{
        Espresso e = new Espresso();
        e.setSize("small");
        c0 = new Chocolate(e);//mocha
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Espresso Chocolate", c0.getDescription());//the description of mocha
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.7, c0.cost(),0.001);//the cost of mocha
    }
}
