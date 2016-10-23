package com.backend;

/**
 * Created by surverules on 10/22/2016.
 */
public interface Animal {
    public int leg=0;
    public void jump();
    public int legcount();

    public default void sayHello(){
        System.out.println("This is new way of Interface having a method sayHello");
    }
}
