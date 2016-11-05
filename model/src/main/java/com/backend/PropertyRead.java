package com.backend;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by surverules on 10/30/2016.
 * <p>
 * problem:
 * Not able to find the path --- its not coming correct.
 *  Finding:
 *      1. Use URI to get teh correct location of Path --- it takes out the %20 that appears instead of space
 *      2. BufferReader.readline to -- read a record.
 */
public class PropertyRead {


    public void readFile() throws IOException, URISyntaxException {
        URI path = PropertyRead.class.getClassLoader().getResource("copybook.property").toURI();
        System.out.println("path: " + path.getPath());
        File file = new File(path.getPath());
        BufferedReader buffReader = null;

        try {
            buffReader = new BufferedReader(new FileReader(file));
            for(String record = buffReader.readLine(); record !=null; record = buffReader.readLine()){
                System.out.println(" Record in the File:" + record);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

    }

    public static void main(String[] args) {
        PropertyRead prop = new PropertyRead();
        try {
            prop.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
