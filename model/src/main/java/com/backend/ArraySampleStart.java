package com.backend;


/**
 * Created by surverules on 10/16/2016.
 */
public class ArraySampleStart implements Runnable {

    int start = 0;
    ArraySample a1 = new ArraySample(10);
    Integer [] array = new Integer[100];

    public ArraySampleStart(int start) {
        this.start = start;
    }

     public void addIntoArray(){
        System.out.println(" Current Thread Name: " + Thread.currentThread().getName()) ;
        for (int i = 0; i < start; i++, start++ ) {
            array[i] = start;
        }
    }

    @Override
    public void run() {

    }
}


