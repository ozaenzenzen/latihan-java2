package com.root;

import com.model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = format1.parse("3/2/2000");

        Person person = new Person(1, "Fauzan", "Software Engineer", "Jalan Jalan dimana saja", date1);

//        person.setId(1);
//        person.setName("Fauzan");
//        person.setJob("Software Engineer");
//        person.setAddress("Jl. Jalan dimana saja");
//        person.setBirth("3/2/2000");


        System.out.println(person.getName());
    }
}
