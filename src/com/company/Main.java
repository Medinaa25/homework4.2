package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите 5 женских имен");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String name4 = scanner.next();

        ArrayList<String> namesA = new ArrayList();
        namesA.add(name);
        namesA.add(name1);
        namesA.add(name2);
        namesA.add(name3);
        namesA.add(name4);
        System.out.println(namesA);

        System.out.println("Введите 5 мужских имен");
        String name5 = scanner.next();
        String name6 = scanner.next();
        String name7 = scanner.next();
        String name8 = scanner.next();
        String name9 = scanner.next();

        ArrayList<String> namesB = new ArrayList();
        namesB.add(name5);
        namesB.add(name6);
        namesB.add(name7);
        namesB.add(name8);
        namesB.add(name9);
        System.out.println(namesB);

        ArrayList<String> namesC = new ArrayList<>();
        namesC.add(name);
        namesC.add(name9);
        namesC.add(name1);
        namesC.add(name8);
        namesC.add(name2);
        namesC.add(name7);
        namesC.add(name3);
        namesC.add(name6);
        namesC.add(name4);
        namesC.add(name5);
        System.out.println(namesC);

        namesC.sort(Comparator.comparing(String::length));
        System.out.println(namesC);

    }
}
