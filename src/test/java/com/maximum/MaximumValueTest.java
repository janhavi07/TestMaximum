package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void whenGivenThreeNumber_FindTheMaximum() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue=maximumValue.findMaxInteger();
        Assert.assertEquals((Integer)10,maxValue);
    }
}
