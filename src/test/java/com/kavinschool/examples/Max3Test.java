package com.kavinschool.examples;

import org.junit.Assert;
import org.junit.Test;

public class Max3Test {

    @Test
    public void testMax3Typical() {
        Assert.assertEquals(10, Max.max3(10,8,7));
    }

    @Test
    public void testMax3Negative() {
        Assert.assertEquals(-1, Max.max3(-1,-100,-1000));
    }

    @Test
    public void testMax3SimpleTypical() {
        Assert.assertEquals(10, Max.max3Simple(10,8,7));
    }

    @Test
    public void testMax3SimpleNegative() {
        Assert.assertEquals(-1, Max.max3Simple(-1,-100,-1000));
    }
}