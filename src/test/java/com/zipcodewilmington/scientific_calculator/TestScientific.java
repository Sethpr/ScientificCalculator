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
        double expected = .84147;
        double actual = scientific.getSine(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getCosineTest1(){
        double expected = 0.5403;
        double actual = scientific.getCosine(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getTangentTest1(){
        double expected = 1.5574;
        double actual = scientific.getTangent(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getInverseSineTest1(){
        double expected = 1.57;
        double actual = scientific.getInverseSine(1);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void getInverseCosineTest1(){
        double expected = 0;
        double actual = scientific.getInverseCosine(1);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void getInverseTangentTest1(){
        double expected = .785398;
        double actual = scientific.getInverseTangent(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void switchUnitsModeTest1(){
        String expected = String.valueOf(.84);
        String actual = scientific.switchUnitsMode(String.valueOf(1));
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getLog1(){
        double expected = .84;
        double actual = scientific.getLog(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getInverseLog1(){
        double expected = .84;
        double actual = scientific.getInverseLog(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getNaturalLog1(){
        double expected = .84;
        double actual = scientific.getNaturalLog(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getInverseNatLog1(){
        double expected = .84;
        double actual = scientific.getInverseNatLog(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void factorial1(){
        double expected = .84;
        double actual = scientific.factorial(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
}