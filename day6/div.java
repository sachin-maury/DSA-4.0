package day6;

public class div {
    
    public static void main(String[] args) {
          Scanner var1 = new Scanner(System.in);
      System.out.println("Enter your year :");
      int var2 = var1.nextInt();
      if ((var2 % 4 != 0 || var2 % 100 == 0) && var2 % 400 != 0) {
         System.out.println("This is not leap year :" + var2);
      } else {
         System.out.println("This is leap year:" + var2);
      }
    }
}


