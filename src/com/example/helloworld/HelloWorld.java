package com.example.helloworld;

import java.util.ArrayList;
import java.util.Iterator;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Yugo");

        for (String car : cars) {
            System.out.println(car);
        }


    }
}
