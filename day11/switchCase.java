

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("Enter your fruit name : ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango":
            System.out.println("King of fruit");
                
                break;
            case "Apple":
            System.out.println("A sweet red fruit");
            break;

            case "Orange":
            System.out.println("A round shape of fruit");
            break;
            case "Grapes":
            System.out.println("It is a small shape of oval");
        
            default:
            System.out.println("item not found");
                break;
        }
    }

}
