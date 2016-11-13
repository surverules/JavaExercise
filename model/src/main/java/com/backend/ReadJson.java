package com.backend;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

/**
 * Created by surverules on 11/5/2016.
 */
public class ReadJson {

    public static void main(String[] args) throws URISyntaxException, ParseException, IOException {
        URI uri = ReadJson.class.getClassLoader().getResource("address.json").toURI();
        System.out.println("Path: " + uri.getPath());

        FileReader fileReader = new FileReader(uri.getPath());
        //Object creation from the Json
        JSONObject jsonObject = (JSONObject) new JSONParser().parse(fileReader);
        String name = (String) jsonObject.get("MYNAME");
        System.out.println("Name: " + name);

        //Implementation of Array Object
        JSONArray address = (JSONArray) jsonObject.get("ADDRESS");
        Iterator i = address.iterator();
        while (i.hasNext()){
            JSONObject jsonObject1 = (JSONObject) i.next();
            Long apt_No = (Long) jsonObject1.get("APT_NO");
            System.out.println(" Apartment # : " + apt_No);
        }

        //Group Reading -- Create another object and then again look into that object.
        JSONObject eduInfo = (JSONObject) jsonObject.get("EDUCATIONAL_INFO");
        String degree = (String) eduInfo.get("EDUCATION");
        System.out.println("Education - Degree : " + degree);

    }

}
