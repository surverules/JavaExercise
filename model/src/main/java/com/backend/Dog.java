package com.backend;

/**
 * Created by surverules on 10/22/2016.
 *
 *      Decription:
 *              1. Class implementing more than one Interface
 *              2. Fully declare the function
 *              3. Each interface is having one default method .. java 8
 *
 */
public class Dog implements Animal, FourLeg{

    private String name;
    private int legcount;

    public Dog(String name, int legcount){
        this.name = name;
        this.legcount = legcount;
    }


    @Override
    public void jump() {
        System.out.println(" Yes Dog can Jump .. so way : " + this.name +  " !!");
    }

    @Override
    public int legcount() {
        return this.legcount;
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Moti", 4);
        dog.sayHello();
        dog.jump();
        System.out.println("Count of Legs for " + dog.name + " are :" + dog.legcount());
        dog.welcome();
    }
}
