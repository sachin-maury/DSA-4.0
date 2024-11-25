package day6;
import java.util.Scanner;

public class multi {
     public static void main(String[] args) {
        Scanner sachin = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sachin.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println( (num * i));
        }

    }
    
}
