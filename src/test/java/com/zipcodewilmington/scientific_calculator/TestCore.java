package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Core;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCore {
    private Core core;
    @Before
    public void setup() {core = new Core();}

        @Test
        public void squareTest1(){

            double expected = 1;
            double actual = core.square(-1);
            Assert.assertEquals(expected, actual, 0.02);
        }
        @Test
            public void squareTest2(){
                double expected = 0.01;
                double actual = core.square(0.1);
                Assert.assertEquals(expected, actual, 0.02);
                }
        @Test
        public void squareTest3(){
            double expected = 0;
            double actual = core.square(0);
            Assert.assertEquals(expected, actual, 0.02);
        }






/*
    @Test
    public void exponentTest() {

        double expected = 0.0;
        double actual = core.exponent(core.getState());
        Assert.assertEquals(expected, actual);
    }

*/




    @Test
    public void squareRootTest() {

        double expected = 0.0;
        double actual = core.squareRoot(core.getState());
        Assert.assertEquals(expected, actual);
    }






    @Test
    public void inverseTest() {

        double expected = 0.0;
        double actual = core.inverse(core.getState());
        Assert.assertEquals(expected, actual);
    }





    @Test
    public void switchSignsTest() {

        double expected = 0.0;
        double actual = core.switchSign(core.getState());
        Assert.assertEquals(expected, actual);
    }

}


