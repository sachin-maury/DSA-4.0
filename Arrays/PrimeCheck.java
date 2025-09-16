import java.util.Scanner;

       

public class PrimeCheck {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // 1. Handle edge cases
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // 2. Check divisors only up to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // If divisible, not prime
                return false;
            }
        }

        return true; // If no divisor found, it's prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call function and print result
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number ✅");
        } else {
            System.out.println(num + " is NOT a Prime Number ❌");
        }

        sc.close();
    }
}

  
