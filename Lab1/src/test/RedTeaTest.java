package test;

import junit.framework.Assert;
import lab1.RedTea;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class RedTeaTest {
	private RedTea rt;
	
    @Before
    public void SetUp() throws Exception{
    	rt = new RedTea();
    }

    @Test(timeout = 1000)
    public void testCost() {
    	rt.setSize("small");
    	Assert.assertEquals(1.0, rt.cost(), 0.001);
    	rt.setSize("medium");
    	Assert.assertEquals(1.3, rt.cost(), 0.001);
    	rt.setSize("large");
    	Assert.assertEquals(1.5, rt.cost(), 0.001);
    	rt.setSize("grant");
    	Assert.assertEquals(1.7, rt.cost(), 0.001);
    }
}
