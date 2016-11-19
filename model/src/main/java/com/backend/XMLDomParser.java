package com.backend;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by surverules on 11/19/2016.
 */
public class XMLDomParser {

    public static void main(String[] args) {
        URI uriPath = null;
        FileReader fileReader = null;

        try {
            uriPath =    XMLDomParser.class.getClassLoader().getResource("Glossary.xml").toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        try {
             fileReader = new FileReader(uriPath.getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            doc = dBuilder.parse(uriPath.getPath());
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //optional, but recommended
        //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("glossary");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                System.out.println("para : " + eElement.getElementsByTagName("para").item(0).getTextContent());
                System.out.println("Acronym : " + eElement.getElementsByTagName("Acronym").item(0).getTextContent());
                System.out.println("GlossSeeAlso - 0 : " + eElement.getElementsByTagName("GlossSeeAlso").item(0).getTextContent());
                System.out.println("GlossSeeAlso - 1 : " + eElement.getElementsByTagName("GlossSeeAlso").item(1).getTextContent());
            }
        }
    }
}
