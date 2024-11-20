package day5;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sachin = new Scanner(System.in);
        System.out.println("Enter your number :");
        int P = sachin.nextInt();
        int R = sachin.nextInt();
        int T = sachin.nextInt();
        int si=(P*T*R)/100;
        System.out.println("The simple interest is :"+si);
    }
}
