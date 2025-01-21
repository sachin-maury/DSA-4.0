

import java.util.Scanner;

public class areaofCircle {
    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner in = new Scanner(System.in);
        double Pi = 3.14;
        double r = in.nextDouble();
        double AreaOfCircle =Pi*(r*r);
        System.out.println(AreaOfCircle);
    }
}
