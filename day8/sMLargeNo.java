

import java.util.Scanner;

public class sMLargeNo {
    public static void main(String[] args) {
        System.out.println("Enter your First number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter your Second number");
        int b = in.nextInt();
        System.out.println("Enter your Third number");
        int c = in.nextInt();
        
        int max =a;
        if (b>max) {
            max =b;
        }
        if(c>max){
            max =c;
        }
        System.out.println("The largest number : "+max);
    }
}
