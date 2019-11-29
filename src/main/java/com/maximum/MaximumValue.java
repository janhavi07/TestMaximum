package com.maximum;

public class MaximumValue {
    public static Integer findMaxInteger() {
        Integer n1 = 5;
        Integer n2 = 10;
        Integer n3 = 2;
        Integer max = n1;
        if (n2.compareTo(max) > 0)
            max = n2;
        if (n3.compareTo(max) > 0)
            max = n3;
        if(n1.compareTo(max)>0)
            max=n1;
        return max;
    }




}
