package com.backend;


/**
 * Created by surverules on 10/16/2016.
 *
 *  Description: Printing the Array detail for Char & Int Array.
 *   Observations:
 *     1.  Unless we have setter (setintArray) defined we cannot set the array intArray directly into main method. Other way is create
 *         another local copy of the array and assign one array to global array.
 *     2. Implemented Generic Method to show the Array Elements
 *          Remember in case of Generics the Element <E> should be a wrapper or Object. Primitives are not allowded in Generics.
 */
public class ArrayClass {
//    public int intArray[] = new int[10];
    public Integer intArray[] = {5,6,7,8,9};
    public Character charArray[] = {'a', 'b', 'c', 'd', 'e'};

    public void setintArray(int start, int end) {
        for (int i = start; i < end ; i++, start++){
            intArray[i] = start;
        }
    }

    public void showArray(int array[]) {
        System.out.print(" Elements in the Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " :");
        }
        System.out.println();
    }

    public void showArray(char array[]) {
        System.out.print(" Elements in the Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " :");
        }
    }

    //Generic Method to show the Array
    public <E> void showArray(E[] array){
        for (E element: array){
            System.out.println(element + " :");
        }
    }

    public static void main(String[] Args) {
        ArrayClass a1 = new ArrayClass();
        int[] internalArray = {5 , 6 , 7 , 8};
        a1.showArray(a1.intArray);
        a1.showArray(a1.charArray);
    }



}


