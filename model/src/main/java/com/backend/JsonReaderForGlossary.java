package com.backend;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by surverules on 11/13/2016.
 *
 *       Observations: 1. Json is nested structure and you have to create multiple objects until the last object to get the required field
 *                     2. We cannot access the inside object without forming it object on top.
 */
public class JsonReaderForGlossary {

    public static void main(String[] args) {

        URI uri =null;
        FileReader fileReader = null;
        JSONObject jsGlobal = null;
        try {
            uri = JsonReaderForGlossary.class.getClassLoader().getResource("Glossary.json").toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        try{
        fileReader = new FileReader(uri.getPath());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try {
            jsGlobal = (JSONObject) new JSONParser().parse(fileReader);
        } catch (ParseException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Json is nested structure and you have to create multiple objects until the last object to get the required field

        JSONObject glossary = (JSONObject) jsGlobal.get("glossary");
        JSONObject glossDiv = (JSONObject) glossary.get("GlossDiv");
        JSONObject glossList = (JSONObject) glossDiv.get("GlossList");
        JSONObject glossEntry = (JSONObject) glossList.get("GlossEntry");
        JSONObject glossDef = (JSONObject) glossEntry.get("GlossDef");
        String para = (String) glossDef.get("para");
        System.out.println("para: " + para);
    }

}
