package com.kavinschool.examples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void isBig() {
        Assert.assertTrue("10 > 8 failed",Max.isBig(10,8));
    }

    @Test
    public void isBigSimple() {
        Assert.assertTrue("10 > 8 failed",Max.isBig(10,8));
    }

    @Test
    public void isBigNegative() {
        Assert.assertFalse("8 > 10 failed",Max.isBig(8,10));
    }

    @Test
    public void isBigSimpleNegative() {
        Assert.assertFalse("8 > 10 failed",Max.isBig(8,10));
    }
}