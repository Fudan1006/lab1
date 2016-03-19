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
public class JasmineTest {
    Jasmine j;
    @Before
    public void SetUp() throws Exception{
        Mockery context = new JUnit4Mockery(){
            {
                setImposteriser(ClassImposteriser.INSTANCE);
                setThreadingPolicy(new Synchroniser());
            }
        };
        GreenTea t = context.mock(GreenTea.class);
        context.checking(new Expectations(){
            {
                oneOf(t).cost();
                will(returnValue((double)1.2));
                oneOf(t).getDescription();
                will(returnValue("Green Tea"));
            }
        });
        j = new Jasmine(t);//flower tea
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Green Tea Jasmine", j.getDescription());//the description of flower tea
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.7, j.cost(), 0.01);//the cost of flower tea
    }
}
