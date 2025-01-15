

import java.util.Scanner;

public class condition1 {

    public static void main(String[] args) {
        System.out.println("Enter your Salary :");
        Scanner sc = new Scanner(System.in);
        int salary= sc.nextInt();
        if(salary>20000){
            System.out.println("You are eligible for bonus 2000");
        }
         else{
            System.out.println("You are eligible for only 1000");
    }
}
}