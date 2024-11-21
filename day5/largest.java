package day5;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sachin = new Scanner(System.in);
        System.out.println("Enter your number");
        int num1 = sachin.nextInt();
        int num2 = sachin.nextInt();
        if(num1>num2){
            System.out.println("the number is largest");
        }
        else{
            System.out.println("this is small number");
        }

    }
}
