package test;

import junit.framework.Assert;
import lab1.Espresso;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class EspressoTest {
	private Espresso es;

    @Before
    public void SetUp() throws Exception{
    	es = new Espresso();
    }

    @Test(timeout = 1000)
    public void testCost() {
    	es.setSize("small");
    	Assert.assertEquals(1.4, es.cost(), 0.001);
    	es.setSize("medium");
    	Assert.assertEquals(1.7, es.cost(), 0.001);
    	es.setSize("large");
    	Assert.assertEquals(2.0, es.cost(), 0.001);
    	es.setSize("grant");
    	Assert.assertEquals(2.3, es.cost(), 0.001);
    }
}
