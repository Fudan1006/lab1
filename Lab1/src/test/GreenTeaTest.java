package test;

import junit.framework.Assert;
import lab1.GreenTea;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class GreenTeaTest {
	private GreenTea gt;
    @Before
    public void SetUp() throws Exception{
    	gt = new GreenTea();
    }

    @Test(timeout = 1000)
    public void testCost() {
    	gt.setSize("small");
    	Assert.assertEquals(1.2, gt.cost(), 0.001);
    	gt.setSize("medium");
    	Assert.assertEquals(1.5, gt.cost(), 0.001);
    	gt.setSize("large");
    	Assert.assertEquals(1.7, gt.cost(), 0.001);
    	gt.setSize("grant");
    	Assert.assertEquals(1.9, gt.cost(), 0.001);

    }
}
