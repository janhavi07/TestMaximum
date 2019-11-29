package com.maximum;

import java.util.Arrays;

public class MaximumValueGeneric<T extends Comparable> {
    T[] array;
    public MaximumValueGeneric(T... values){
        T[] tempArray=(T[]) new Comparable[values.length];
        int i=0;
        for(T a: values ) {
            tempArray[i] = a;
            i++;
        }
        this.array=tempArray;
    }
    public T toPrint(){
        Arrays.sort(array);
        return array[array.length-1];

    }
}
