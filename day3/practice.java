

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("Enter your first num :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter your second num :");
        int num2 = sc.nextInt();
        int sum = (num1+num2);
        System.out.println("The number is :"+sum);
    }
}
