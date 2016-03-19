package test;
import lab1.TeaBeverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class TeaBeverageTest {
	TeaBeverage tb;
    @Before
    public void SetUp() throws Exception{
    	tb=new TeaBeverage();
    }

    @Test(timeout = 1000)
    public void testSetSize() {    	
    }

    @Test(timeout = 1000)
    public void testCost(){
    	tb.setSize("small");
    	Assert.assertEquals(0.2, tb.cost(), 0.001);
    	tb.setSize("medium");
    	Assert.assertEquals(0.5, tb.cost(), 0.001);
    	tb.setSize("large");
    	Assert.assertEquals(0.7, tb.cost(), 0.001);
    	tb.setSize("grant");
    	Assert.assertEquals(0.9, tb.cost(), 0.001);    
    }
}
