package test;

import lab1.*;
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
public class GingerTest {
    Ginger g0;
    @Before
    public void SetUp() throws Exception{
        Mockery context = new JUnit4Mockery(){
            {
                setImposteriser(ClassImposteriser.INSTANCE);
                setThreadingPolicy(new Synchroniser());
            }
        };
        GreenTea g = context.mock(GreenTea.class);
        context.checking(new Expectations(){
            {
                oneOf(g).cost();
                will(returnValue((double)1.2));
                oneOf(g).getDescription();
                will(returnValue("Green Tea"));
            }
        });
        g0 = new Ginger(g);//ginger tea
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Green Tea Ginger", g0.getDescription());//the description of ginger tea
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.8 , g0.cost(), 0.001);//the cost o ginger tea
    }
}
