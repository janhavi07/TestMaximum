package com.maximum;

public class MaximumValue {
    public <E extends Comparable<E>> E findMaximum(E a, E b,E c){
        E max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;
        if(a.compareTo(max)>0)
            max=a;
        return max;
    }
}
