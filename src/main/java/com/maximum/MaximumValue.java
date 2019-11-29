package com.maximum;

public class MaximumValue<E extends Comparable> {
   // E[] values;
    E value1;
    E value2;
    E value3;
    public MaximumValue(E value1,E value2,E value3){
        this.value1=value1;
        this.value2=value2;
        this.value3=value3;
    }
    public <E extends Comparable<E>> E findMaximum(){
        E max=(E)value1;
        if(value2.compareTo(max)>0)
            max=(E)value2;
        if(value3.compareTo(max)>0)
            max=(E)value3;
        if(value1.compareTo(max)>0)
            max=(E)value1;
        return max;
    }
}
