package test;

import lab1.BeverageStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangxin on 16/3/18.
 */
public class BeverageStoreTest {
    BeverageStore bs;

    @Before
    public void setUp() throws Exception {
        bs = new BeverageStore();
    }

    @Test(timeout = 1000)
    public void testCreateBeverage() {
    }
}
