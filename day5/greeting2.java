package day5;

import java.util.Scanner;

public class greeting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your most welcom "+name);
    }
}
