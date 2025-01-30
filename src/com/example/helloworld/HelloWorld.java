package com.example.helloworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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

        Scanner reader = new Scanner(System.in);
        System.out.print("Hva heter du?");
        String name = reader.nextLine();
        System.out.println("Hei " + name);

    }
}
