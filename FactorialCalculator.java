import java.util.Scanner;

public class FactorialCalculator {
    
    // Factorial Function
    public static int factorialRecursive(int n) {
        
        if (n == 0) {
            return 1;
        
        } else {
            return (n * factorialRecursive(n - 1));
        } 
    }

    public static int factorialIterative(int n) {
       int result = 1;
       for (int i = 1; i<=n; i++){
        result *= i;
       }
       return result;
    }

    // Main Method 
    public static void main(String[] args) throws Expectation {
        Scanner scanner = new Scanner(System.in); // Creates a new object of Scanner class
        System.out.println("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        if (n < 0){
            throw new Expectation ("The input must be a positive integer");
        }

        //Calls the methods to calculate factorial and sum of n numbers 
        System.out.println("Factorial of " + n + " (Recursive): " + factorialRecursive(n));
        System.out.println("Factorial of " + n + " (Iterative): " + factorialIterative(n));

    }
}
