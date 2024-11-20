import java.util.Scanner;

public class celsiusTofaren {

    
public static void main(String[] args) {
    Scanner sachin = new Scanner(System.in);
    System.out.println("Enter your number in celsious:");
    float tempC = sachin.nextFloat();
    float tempF = (tempC*9/5)+32;
    System.out.println(tempF);
}
}