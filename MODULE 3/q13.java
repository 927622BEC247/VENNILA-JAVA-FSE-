import java.util.Scanner;

public class q13 {
    
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 1) return 0;       // 1st Fibonacci number is 0
        if (n == 2) return 1;       // 2nd Fibonacci number is 1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for a positive integer
        System.out.print("Enter the position (n) of Fibonacci number to calculate: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int fibNumber = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is " + fibNumber);
        }
        
        scanner.close();
    }
}
