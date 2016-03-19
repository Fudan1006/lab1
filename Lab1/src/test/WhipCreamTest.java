package test;

import lab1.Espresso;
import lab1.WhipCream;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.concurrent.Synchroniser;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class WhipCreamTest {
    WhipCream w;
    @Before
    public void SetUp() throws Exception{
        Mockery context = new JUnit4Mockery(){
            {
                setImposteriser(ClassImposteriser.INSTANCE);
                setThreadingPolicy(new Synchroniser());
            }
        };
        Espresso e = context.mock(Espresso.class);
        context.checking(new Expectations(){
            {
                oneOf(e).cost();
                will(returnValue((double)1.4));
                oneOf(e).getDescription();
                will(returnValue("Espresso"));
            }
        });
        w = new WhipCream(e);//cappuccino
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Espresso Whip Cream", w.getDescription());//the description of cappuccino
    }

    @Test(timeout = 1000)
    public void testCost(){
        Assert.assertEquals(1.7, w.cost(), 0.001);//the cost of cappuccino
    }
}
