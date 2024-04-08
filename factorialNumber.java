
public class Factorial {
    
    // Factorial Function
    public static int factorial(int n) {
        
        if (n == 0) {
            return 1;
        
        } else {
            return (n * factorial(n - 1));
        } 
    }

    // Main Method 
    public static void main(String[] args) {
        
        int n = 4;
        int fact = factorial(n);

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
