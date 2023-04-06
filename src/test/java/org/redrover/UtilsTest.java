package org.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testSum(){
        Assert.assertEquals(Utils_9.sum(2,4),6);
    }
    @Test
    public void testAbbr(){
        Assert.assertEquals(Utils_9.abbr("1234567890",4),"1...");
    }
    @Test
    public void testAbbreviate(){
        Assert.assertEquals(Utils_9.abbreviate("1234567890",11),"1234567890");
    }
}
