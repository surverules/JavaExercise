package com.backend;

/**
 * Created by surverules on 10/16/2016.
 *   Desc:  Add elements into Array and this is implementing Runnable class
 *          We want to do the Threadsafe Test on this module.
 *          Two threads will be running this module and will be adding into Array at same time.
 *
 */
public class ArraySample {

    public static int array[];
    public int size = 0;

    public ArraySample(int size) {
        this.size = size;
        array = new int[this.size];
    }

    public void showArray(){
        System.out.println(" Elements added in Array: ");
        for (int i = 0; i < array.length ; i++ ) {
            System.out.print(" " + array[i]);
        }
    }


}
