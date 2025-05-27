public class q8 {
    public static void main(String[] args) {
        // Expression 1
        int result1 = 10 + 5 * 2;  
        // Multiplication (*) has higher precedence than addition (+)
        // So it is evaluated as 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("Result of 10 + 5 * 2 = " + result1);

        // Expression 2
        int result2 = (10 + 5) * 2;  
        // Parentheses have highest precedence, so (10 + 5) is evaluated first
        // Then multiplication: 15 * 2 = 30
        System.out.println("Result of (10 + 5) * 2 = " + result2);

        // Expression 3
        int result3 = 100 / 5 + 2 * 3;  
        // Division and multiplication have same precedence and evaluated left to right
        // So: (100 / 5) + (2 * 3) = 20 + 6 = 26
        System.out.println("Result of 100 / 5 + 2 * 3 = " + result3);

        // Expression 4
        int result4 = 100 / (5 + 2) * 3;  
        // Parentheses first: 5 + 2 = 7
        // Then division and multiplication left to right: (100 / 7) * 3
        // Integer division: 100/7 = 14, then 14 * 3 = 42
        System.out.println("Result of 100 / (5 + 2) * 3 = " + result4);
    }
}
