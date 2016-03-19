package test;

import lab1.Ginger;
import lab1.GreenTea;
import lab1.TeaBeverage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class GingerTest {
    Ginger g0;
    @Before
    public void SetUp() throws Exception{
        TeaBeverage g = new GreenTea();
        g.setSize("small");
        g0 = new Ginger(g);//ginger tea
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Green Tea Ginger", g0.getDescription());//the description of ginger tea
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.8 , g0.cost(), 0.001);//the cost o ginger tea
    }
}
