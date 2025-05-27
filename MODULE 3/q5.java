import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        scanner.close();
    }
}
