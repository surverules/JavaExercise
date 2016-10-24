package com.backend;

/**
 * Created by surverules on 10/24/2016.
 *
 *      Making a class Final Has following advantages:
 *          1. It does not let other class to extend it. You can create a composition of object and use it. .
 *         E.g. String class is a final class. Hence we cannot extend it.
 *              Practical example is - In case of Cobol we can make the Stat class as Final.
 */
public final class Singleton {

    int num = 0;
    public Singleton(int num){
        this.num = num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

}
