import java.util.Scanner;

public class convert {
    public static void main(String[] var0) {
      System.out.println("Enter your first num :");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      System.out.println("Enter your second num :");
      int var3 = var1.nextInt();
      int var4 = var2 + var3;
      System.out.println("The number is :" + var4);
   }
}
