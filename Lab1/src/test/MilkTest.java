package test;


import lab1.Espresso;
import lab1.Milk;
import lab1.RedTea;
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
public class MilkTest {
    Milk m0,m1;
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
        m0 = new Milk(e);//latte

        Mockery context1 = new JUnit4Mockery(){
            {
                setImposteriser(ClassImposteriser.INSTANCE);
                setThreadingPolicy(new Synchroniser());
            }
        };
        RedTea r = context1.mock(RedTea.class);
        context1.checking(new Expectations(){
            {
                oneOf(r).cost();
                will(returnValue((double)1.0));
                oneOf(r).getDescription();
                will(returnValue("Red Tea"));
            }
        });
        m1 = new Milk(r);//tea latte
    }

    @Test(timeout = 1000)
    public void testGetDescription() {
        Assert.assertEquals("Espresso Milk", m0.getDescription());//the description of latte
        Assert.assertEquals("Red Tea Milk", m1.getDescription());//the description of tea latte
    }

    @Test(timeout = 1000)
    public void testCost() {
        Assert.assertEquals(1.7, m0.cost(),0.001);//the cost of latte
        Assert.assertEquals(1.3, m1.cost(),0.001);//the cost of tea latte
    }
}
