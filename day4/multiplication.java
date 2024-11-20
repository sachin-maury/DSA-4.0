package day4;

import java.util.Scanner;



public class multiplication {
    public static void main(String[] args) {
        Scanner sachin = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sachin.nextInt();
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

    }
}
