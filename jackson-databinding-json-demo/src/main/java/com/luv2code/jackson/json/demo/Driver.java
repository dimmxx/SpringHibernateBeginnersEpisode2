package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        StudentComplex student = null;
        try {
            student = objectMapper.readValue(new File("data/sample-full.json"), StudentComplex.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(student);

        student.setId(10);
        student.setFirstName("John");
        student.setLastName("Peterson");
        student.setActive(false);
        student.getAddress().setCity("Kyiv");
        student.getAddress().setCountry("Country");
        student.getAddress().setState("State");
        student.getAddress().setZip(11);
        student.getAddress().setState("State");
        student.setLanguages(new String[]{"English", "Russian"});


        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            objectMapper.writeValue(new File("data/output.json"), student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
