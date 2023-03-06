package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Core;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCore {
    public Core core;
    @Before
    public void setup() {core = new Core();}
    @Test
    public void addTest1(){
        double expected = 0;
        double actual = core.add(-1.1, 1.1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void subtractTest1(){
        double expected = 2.2;
        double actual = core.subtract(1.1, -1.1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void multiplyTest1(){
        double expected = 0.01;
        double actual = core.multiply(-0.1, -0.1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void divideTest1(){
        double expected = 1;
        double actual = core.divide(-0.1, -0.1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void squareTest1(){
        double expected = 1;
        double actual = core.square(-1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void squareTest2(){
        double expected = 0.01;
        double actual = core.square(0.1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void squareTest3(){
        double expected = 0;
        double actual = core.square(0);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void exponentTest1() {
        double expected = 1.0;
        double actual = core.exponent(0.0,0.0);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareRootTest1() {
        double expected = 1.0;
        double actual = core.squareRoot(1.0);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void squareRootTest2() {
        double expected = 0.316227;
        double actual = core.squareRoot(0.1);
        Assert.assertEquals(expected, actual, 0.01);
        System.out.println(core.squareRoot(0.1));
    }
    @Test
    public void inverseTest1() {
        double expected = 0.1;
        double actual = core.inverse(10.0);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void switchSignsTest1() {
        double expected = -1.0;
        double actual = core.switchSign(1.0);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void switchSignsTest2() {
        double expected = 1;
        double actual = core.switchSign(-1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void modTest1() {
        double expected = 0.5;
        double actual = core.mod(3.0, 1.25);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void roundTest1() {
        double expected = 1;
        double actual = core.round(1.23);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void floorTest1() {
        double expected = 1;
        double actual = core.floor(1.6);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void absTest1() {
        double expected = 1;
        double actual = core.abs(-1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void ceilingTest1() {
        double expected = 2;
        double actual = core.ceiling(1.2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}


