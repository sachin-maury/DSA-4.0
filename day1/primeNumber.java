import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary =Integer.parseInt(scanner.nextLine());
        
        if (salary > 10000) {
            salary+=2000;
            System.out.println("salary :"+salary);
        }
        else{
            salary+=1000;
            System.out.println("Salary:"+salary);
        }
        
    }
}