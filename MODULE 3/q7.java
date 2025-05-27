public class q7 {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.78;
        
        // Cast double to int (fractional part will be lost)
        int myInt = (int) myDouble;
        System.out.println("Double value: " + myDouble);
        System.out.println("After casting double to int: " + myInt);
        
        // Declare an int variable
        int anotherInt = 42;
        
        // Cast int to double
        double anotherDouble = (double) anotherInt;
        System.out.println("Int value: " + anotherInt);
        System.out.println("After casting int to double: " + anotherDouble);
    }
}



