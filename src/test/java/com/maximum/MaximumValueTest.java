package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void whenGivenThree_Integer_Number_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue=maximumValue.findMaximum(10,5,2);
        Assert.assertEquals((Integer)10,maxValue);
    }

    @Test
    public void whenGivenThree_Float_Number_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        Float maxValue=maximumValue.findMaximum(10.52f,10.25f,10.02f);
        Assert.assertEquals((Float)10.52f,maxValue);
    }

    @Test
    public void whenGivenThree_Strings_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        String maxValue=maximumValue.findMaximum("Janhavi","Atul","Parte");
        Assert.assertEquals("Parte",maxValue);
    }
}
