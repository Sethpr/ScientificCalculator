package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestScientific {
    public Scientific scientific;
    @Before
    public void setup() {scientific = new Scientific();}
    @Test
    public void getSineTest1(){
        double expected = 0.841470;
        double actual = scientific.sine(1);
        Assert.assertEquals(expected, actual, 0.00001);
    }
    @Test
    public void getCosineTest1(){
        double expected = 0.540302;
        double actual = scientific.cosine(1);
        Assert.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void getTangentTest1(){
        double expected = 1.557407;
        double actual = scientific.tangent(1);
        Assert.assertEquals(expected, actual, 0.000001);
    }
    @Test
    public void getInverseSineTest1(){
        double expected = 1.570796;
        double actual = scientific.inverseSine(1);
        Assert.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void getInverseCosineTest1(){
        double expected = 0;
        double actual = scientific.inverseCosine(1);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getInverseTangentTest1(){
        double expected = .785398;
        double actual = scientific.inverseTangent(1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getLog1(){
        double expected = 0.69897;
        double actual = scientific.log(5);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getInverseLog1(){
        double expected = 10;
        double actual = scientific.inverseLog(1);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getNaturalLog1(){
        double expected = 1.60943;
        double actual = scientific.naturalLog(5);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getInverseNatLog1(){
        double expected = 148.4131591;
        double actual = scientific.inverseNatLog(5);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void factorial1(){
        double expected = -6;
        double actual = scientific.factorial(-3);
        Assert.assertEquals(expected, actual, 0.01);
    }
}