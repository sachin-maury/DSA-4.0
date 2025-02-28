import java.util.Scanner;

public class primeNumber {
   public primeNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter your salary: ");
      int var2 = Integer.parseInt(var1.nextLine());
      if (var2 > 10000) {
         var2 += 2000;
         System.out.println("salary :" + var2);
      } else {
         var2 += 1000;
         System.out.println("Salary:" + var2);
      }

   }
}
