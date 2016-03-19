package test;

import junit.framework.Assert;
import lab1.WhiteTea;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class WhiteTeaTest {
	private WhiteTea wt;
    @Before
    public void SetUp() throws Exception{
    	wt = new WhiteTea();
    }

    @Test(timeout = 1000)
    public void testCost(){
    	wt.setSize("small");
    	Assert.assertEquals(1.2, wt.cost(), 0.001);
    	wt.setSize("medium");
    	Assert.assertEquals(1.5, wt.cost(), 0.001);
    	wt.setSize("large");
    	Assert.assertEquals(1.7, wt.cost(), 0.001);
    	wt.setSize("grant");
    	Assert.assertEquals(1.9, wt.cost(), 0.001);

    }
}
