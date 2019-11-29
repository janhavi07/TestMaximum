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


    public static Float findMaxFloat() {
        Float n1=10.52f;
        Float n2=10.25f;
        Float n3=10.02f;
        Float max=n1;
        if (n2.compareTo(max) > 0)
            max = n2;
        if (n3.compareTo(max) > 0)
            max = n3;
        if(n1.compareTo(max)>0)
            max=n1;
        return max;
    }

    public static String findMaxString() {
        String string1="Janhavi";
        String string2="Atul";
        String string3="Parte";
        String max=string1;
        if (string2.compareTo(max) > 0)
            max = string2;
        if (string3.compareTo(max) > 0)
            max = string3;
        if(string1.compareTo(max)>0)
            max=string1;
        return max;
    }
}
