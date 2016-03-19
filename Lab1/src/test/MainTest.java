package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lab1.Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class MainTest {
    @Before
    public void setUp() throws Exception {  
    }

    @Test(timeout = 1000)
    public void testCalculate() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
    	Main m=new Main();
        String[] array1={"espresso","large"};  
        String[] array2={"mocha","small"};  
        String[] array3={"houseblend","grant","milk","chocolate"};  
        String[] array4={"latte","medium","ginger","jasmine","whip"};  
        String[] array5={"cappuccino","grant","jasmine","whip"};
        String[] array6={"tea","latte","large"};  
        String[] array7={"decaf","mocha","small"};  
        String[] array8={"white","tea","grant","milk","chocolate"};  
        String[] array9={"green","tea","medium","ginger"};  
        String[] array10={"flower","tea","grant","chocolate","whip"};
        Method method = Main.class.getDeclaredMethod("calculate", String[].class);
        method.setAccessible(true);      
        double actual1 = (double)method.invoke(m,(Object)array1);
        double actual2 = (double)method.invoke(m,(Object)array2); 
        double actual3 = (double)method.invoke(m,(Object)array3); 
        double actual4 = (double)method.invoke(m,(Object)array4); 
        double actual5 = (double)method.invoke(m,(Object)array5);
        double actual6 = (double)method.invoke(m,(Object)array6);
        double actual7 = (double)method.invoke(m,(Object)array7); 
        double actual8 = (double)method.invoke(m,(Object)array8); 
        double actual9 = (double)method.invoke(m,(Object)array9); 
        double actual10 = (double)method.invoke(m,(Object)array10);
    	Assert.assertEquals(2.0, actual1,0.001);
    	Assert.assertEquals(1.7, actual2,0.001);
    	Assert.assertEquals(2.7, actual3,0.001);
    	Assert.assertEquals(3.4, actual4,0.001);
    	Assert.assertEquals(3.4, actual5,0.001);
    	Assert.assertEquals(1.8, actual6,0.001);
    	Assert.assertEquals(1.2, actual7,0.001);
    	Assert.assertEquals(2.5, actual8,0.001);
    	Assert.assertEquals(2.1, actual9,0.001);
    	Assert.assertEquals(3.0, actual10,0.001);
    }
}
