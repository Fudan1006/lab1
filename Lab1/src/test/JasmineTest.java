package test;

import lab1.GreenTea;
import lab1.Jasmine;
import lab1.TeaBeverage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class JasmineTest {
    Jasmine j;
    @Before
    public void SetUp() throws Exception{
        TeaBeverage t = new GreenTea();
        t.setSize("small");
        j = new Jasmine(t);//flower tea
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Green Tea Jasmine", j.getDescription());//the description of flower tea
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.7, j.cost(), 0.01);//the cost of flower tea
    }
}
