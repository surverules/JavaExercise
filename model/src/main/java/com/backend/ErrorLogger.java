package com.backend;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by surverules on 10/24/2016.
 *
 *      Singleton Test:
 *          1. Create only one object... The contructor is private
 *          2. Keeping a Track of count of object using a Static variable.
 *          3. Dont forget to run the Test class created.
 */
public class ErrorLogger {
    private ErrorLogger(){
        System.out.println("Private Contructor created Once");
    }

    public static ErrorLogger errorLogger=null;
    public static int instancecount=0;

    public static ErrorLogger newInstance(){
        if (errorLogger == null) {
            instancecount += 1;
            errorLogger = new ErrorLogger();
            return errorLogger;
        }
        return errorLogger;
    }

}
