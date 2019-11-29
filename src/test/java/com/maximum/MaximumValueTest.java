package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void whenGivenThree_Integer_Number_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue(10,5,2);
        Comparable maxValue=maximumValue.findMaximum();
        Assert.assertEquals(10,maxValue);
    }

    @Test
    public void whenGivenThree_Float_Number_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue(10.52f,10.25f,10.02f);
        Comparable maxValue=maximumValue.findMaximum();
        Assert.assertEquals(10.52f,maxValue);
    }

    @Test
    public void whenGivenThree_Strings_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue("Janhavi","Atul","Parte");
        Comparable maxValue= maximumValue.findMaximum();
        Assert.assertEquals("Parte",maxValue);
    }
}
