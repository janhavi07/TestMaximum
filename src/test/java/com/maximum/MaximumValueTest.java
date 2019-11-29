package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void whenGivenThree_Integer_Number_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue=maximumValue.findMaxInteger();
        Assert.assertEquals((Integer)10,maxValue);
    }

    @Test
    public void whenGivenThree_Float_Number_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        Float maxValue=maximumValue.findMaxFloat();
        Assert.assertEquals((Float)10.52f,maxValue);
    }

    @Test
    public void whenGivenThree_Strings_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        String maxValue=maximumValue.findMaxString();
        Assert.assertEquals("Parte",maxValue);
    }
}
