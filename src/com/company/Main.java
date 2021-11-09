package com.company;

import java.util.Scanner;

public class Main {

    public static int chickens() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chickens");
        return input.nextInt();
    }

    public static int cows() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cows");
        return input.nextInt();
    }

    public static int pigs() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pigs");
        return input.nextInt();
    }

    public static void main(String[] args) {
        int cow = 4;
        int pig = 4;
        int chicken = 2;
        int legs = (pig * pigs()) + (cow * cows()) + (chicken * chickens());
        System.out.println(legs + " legs");
    }
}
