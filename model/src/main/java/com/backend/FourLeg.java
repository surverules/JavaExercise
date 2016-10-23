package com.backend;

/**
 * Created by surverules on 10/22/2016.
 *
 *      Interfacing is having a default method ... java 8
 */
public interface FourLeg {

    public default void welcome(){

        System.out.println("Welcome to the group of Four leg species");
    }
}
