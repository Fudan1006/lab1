package test;

import lab1.BeverageStore;
import lab1.Milk;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class MilkTest {
    Milk m0,m1;
    BeverageStore bs;
    @Before
    public void SetUp() throws Exception{
        bs = new BeverageStore();
        m0 = new Milk(bs.createBeverage("espresso","small"));//latte
        m1 = new Milk(bs.createBeverage("red tea","small"));//tea latte
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Esspresso Milk", m0.getDescription());//the description of latte
        Assert.assertEquals("Red Tea Milk", m1.getDescription());//the description of tea latte
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.7, m0.cost(),0.001);//the cost of latte
        Assert.assertEquals(1.3, m1.cost(),0.001);//the cost of tea latte

    }
}
