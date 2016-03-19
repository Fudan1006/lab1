package test;

import lab1.BeverageStore;
import lab1.CoffeeBeverage;
import lab1.SizeFactor;

import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class BeverageStoreTest {
    BeverageStore bs;
    @Before
    public void setUp() throws Exception {
        bs = new BeverageStore();
    }

    @Test(timeout = 1000)
    public void testCreateBeverage() {
    	Assert.assertEquals("Espresso",bs.createBeverage("espresso", "small").getDescription());
    	Assert.assertEquals("Espresso Chocolate",bs.createBeverage("mocha", "large").getDescription());
    }
}
