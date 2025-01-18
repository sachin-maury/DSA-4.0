

import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        System.out.println("Enter your First number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter your Second number");
        int b = in.nextInt();
        System.out.println("Enter your Third number");
        int c = in.nextInt();

        if (a>b && a>c) {
            System.out.println("The a is greater : "+a);
        }
        else if (b>a && b>c) {
            System.out.println("The b is grater : "+b);
        }
        else if (c>a && c>b) {
            System.out.println("The c is greater : "+c);            
        }
    }
}
