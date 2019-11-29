package com.maximum;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;

public class MaximumValueTest {
    @Test
    public void whenGivenThree_Integer_Number_FindTheMaximumValue() {
        MaximumValue<Integer> maximumValue = new MaximumValue<Integer>(10,5,2);
        Comparable maxValue=(Integer)maximumValue.findMaximum();
        Assert.assertEquals(10,maxValue);
    }

    @Test
    public void whenGivenThree_Float_Number_FindTheMaximumValue() {
        MaximumValue<Float> maximumValue = new MaximumValue<Float>(10.52f,10.25f,10.02f);
        Comparable maxValue=(Float)maximumValue.findMaximum();
        Assert.assertEquals(10.52f,maxValue);
    }

    @Test
    public void whenGivenThree_Strings_FindTheMaximumValue() {
        MaximumValue<String> maximumValue = new MaximumValue<String>("Janhavi","Atul","Parte");
        Comparable maxValue= (String)maximumValue.findMaximum();
        Assert.assertEquals("Parte",maxValue);
    }

    @Test
    public void whenGivenThree_Integer_FindTheMaximum_At_FirstPosition() {
        MaximumValue<Integer> integerMaximumValue = new MaximumValue<>(10, 9, 8);
        Comparable maxValue=(Integer)integerMaximumValue.findMaximum();
        Assert.assertEquals(10,maxValue);
    }

    @Test
    public void whenGivenThree_Integer_FindTheMaximum_At_SecondPosition() {
        MaximumValue<Integer> integerMaximumValue = new MaximumValue<>(9, 10, 8);
        Comparable maxValue=(Integer)integerMaximumValue.findMaximum();
        Assert.assertEquals(10,maxValue);
    }
}
