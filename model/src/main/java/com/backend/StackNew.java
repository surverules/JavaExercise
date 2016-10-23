package com.backend;

/**
 * Created by surverules on 10/19/2016.
 *
 *      Tag: Generics
 *      Create a new Stack Collection which will internally hold things into Array
 */
public class StackNew<T extends Number> {
    int size;
    static int occur = 0;
    Number[] collection;
    public StackNew(int size) {
        this.size = size;
        collection = new Number[size];
    }

    /**
     * Add element of Number or its child into Array
     * @param element: Number or its Child Object
     * @param <T>
     */
    public <T extends Number> void push(T element){
        collection[occur] = element;
        occur ++;
    }

    public <T extends Number> void push(T[] list){
        System.out.println(" Loading whole List into Stack");
        for (T element : list) {
            collection[occur] = element;
            occur++;
        }
    }

    /**
     * Takes out element out of Stack
     */
    public  void pop() {
        System.out.println("Display the lastest Top element in the Stack");
        occur --;
        System.out.println("Element: " + collection[occur]);
    }

    /**
     * Takes out All elements out of Stack
     */
    public  void popAll() {
        System.out.println("Display the lastest Top element in the Stack: " + occur--);
       // occur --;
        for (int i = occur; i<0; i-- )
          System.out.println("Element: " + collection[i]);
    }

}
