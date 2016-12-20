package com.backend;

/**
 * Created by surverules on 12/19/2016.
 */
public class Car {

    private String make;
    public String Type = "Racing";

    public void show(){

        try {
            //System.out.println(" Make: " + make.toString());
            System.out.println("Type : " + Type.toString());
            System.out.println(" In Try block");
        } catch (NullPointerException e){
            System.out.println("in Catch Block");
            System.exit(0);
        } finally {
            System.out.println(" In finally Block");
        }

    }

    public static void main(String[] args) {
        Car tata = new Car();
        tata.show();
    }
}
