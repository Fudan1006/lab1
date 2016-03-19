package test;


import junit.framework.Assert;
import junit.framework.TestCase;
import lab1.CoffeeBased;
import lab1.CoffeeBeverage;
import lab1.Decaf;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class DecafTest {
	private Decaf decaf;

    @Before
    public void SetUp() throws Exception{
        decaf = new Decaf();
    }

    @Test(timeout = 1000)
    public void testCost() {
    	decaf.setSize("small");
    	Assert.assertEquals(0.9, decaf.cost(),0.001);
    	decaf.setSize("medium");
    	Assert.assertEquals(1.2, decaf.cost(),0.001);
    	decaf.setSize("large");
    	Assert.assertEquals(1.5, decaf.cost(),0.001);
    	decaf.setSize("grant");
    	Assert.assertEquals(1.8, decaf.cost(),0.001);
    }
}
