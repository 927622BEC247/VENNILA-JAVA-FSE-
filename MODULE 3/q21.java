class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) throw new InvalidAgeException("Age must be 18 or older");
            System.out.println("Valid age");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}