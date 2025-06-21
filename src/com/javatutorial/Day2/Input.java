package com.javatutorial.Day2;

import java.util.*;

public class Input {
    public static void main(String[] args) {

        // Input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your price : ");
        float price = sc.nextFloat();

        System.out.print("Enter your newPrice : ");
        double newPrice = sc.nextDouble();

        System.out.print("Enter your boolean : ");
        boolean flag = sc.nextBoolean();

        System.out.print("Enter your ch : ");
        char ch = sc.next().charAt(0);

        System.out.println("-----------Output-----------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Price : " + price);
        System.out.println("NewPrice : " + newPrice);
        System.out.println("Flag : " + flag);
        System.out.println("Ch : " + ch);
    }
}
