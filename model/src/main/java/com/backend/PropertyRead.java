package com.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by surverules on 10/30/2016.
 *
 *      problem:
 *              Not able to find the path --- its not coming correct.
 */
public class PropertyRead {


    public void readFile() throws IOException {
        URL path = PropertyRead.class.getClassLoader().getResource("copybook.property");
        System.out.println("path: " + path);
        File file = new File(path.getPath());
        FileReader fileReader =  null;

        try {
           fileReader = new FileReader(file);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        System.out.println(" Record in the File:" + fileReader.read());
    }

    public static void main(String[] args) {
        PropertyRead prop  = new PropertyRead();
        try {
            prop.readFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
