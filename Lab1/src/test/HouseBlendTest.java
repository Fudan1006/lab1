package test;

import junit.framework.Assert;
import lab1.HouseBlend;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class HouseBlendTest {
	private HouseBlend hb;

    @Before
    public void SetUp() throws Exception{
    	hb = new HouseBlend();
    }

    @Test(timeout = 1000)
    public void testCost() {
    	hb.setSize("small");
    	Assert.assertEquals(1.2, hb.cost(), 0.001);
    	hb.setSize("medium");
    	Assert.assertEquals(1.5, hb.cost(), 0.001);
    	hb.setSize("large");
    	Assert.assertEquals(1.8, hb.cost(), 0.001);
    	hb.setSize("grant");
    	Assert.assertEquals(2.1, hb.cost(), 0.001);
    }
}
