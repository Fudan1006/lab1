package test;
import lab1.CoffeeBeverage;
import lab1.SizeFactor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.jmock.*;
import org.jmock.integration.junit4.JUnit4Mockery;


/**
 * Created by wangxin on 16/3/18.
 */
public class CoffeeBeverageTest {
    CoffeeBeverage cb;
    JUnit4Mockery context;
    SizeFactor mocksizeFactor;
    @Before
    public void SetUp() throws Exception{    
    	context= new JUnit4Mockery();
    	cb=new CoffeeBeverage();
    	cb.setSize("small");
        double r=cb.cost();
    	mocksizeFactor=context.mock(SizeFactor.class);
    	context.checking(new Expectations(){
    		{   oneOf(mocksizeFactor).sizeCost("small");
    		    will(returnValue(0.4));    			
    		}
    	});	    
    }

    @Test(timeout = 1000)
    public void testCost() {   	
    	 Assert.assertEquals(0.4,cb.cost(),0.001);
    }
}
