package com.backend;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by surverules on 11/5/2016.
 */
public class ReadJson {

    public static void main(String[] args) throws URISyntaxException, ParseException, IOException {
        URI uri = ReadJson.class.getClassLoader().getResource("address.json").toURI();
        System.out.println("Path: " + uri.getPath());

        FileReader fileReader = new FileReader(uri.getPath());
        JSONObject jsonObject = (JSONObject) new JSONParser().parse(fileReader);
        String name = (String) jsonObject.get("MYNAME");
        System.out.println("Name: " + name);

    }

}
