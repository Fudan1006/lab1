package test;

import lab1.Beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class BeverageTest {
    Beverage b;

    @Before
    public void setUp() throws Exception {
        b = new Beverage() {
            @Override
            public double cost() {
                return 0;
            }
        };
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
    	Assert.assertEquals("Unknown beverage",b.getDescription());
    }
}
