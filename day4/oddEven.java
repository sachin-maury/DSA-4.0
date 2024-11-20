import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner sachin = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sachin.nextInt();
        if(num % 2 == 0){
            System.out.println("This number is even :"+num);
        }
        else{
            System.out.println("This number is odd :"+num);
        }
    }
}