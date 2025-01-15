

import java.util.Scanner;

public class condition1 {

    public static void main(String[] args) {
        System.out.println("Enter your Salary :");
        Scanner sc = new Scanner(System.in);
        int salary= sc.nextInt();
        if(salary>10000){
            salary = salary+2000;
            System.out.println("your salary is : "+salary);
        }
         else{
            salary= salary+1000;
            System.out.println("your salary is : "+salary);
    }
}
}