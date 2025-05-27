public class q12 {
    
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Call and display results from overloaded methods
        System.out.println("Add two integers (5 + 10): " + add(5, 10));
        System.out.println("Add two doubles (5.5 + 10.5): " + add(5.5, 10.5));
        System.out.println("Add three integers (1 + 2 + 3): " + add(1, 2, 3));
    }
}
