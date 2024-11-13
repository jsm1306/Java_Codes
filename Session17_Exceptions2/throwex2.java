public class throwex2 {
    public static void main(String[] args) {
        int age = -5;

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age is valid: " + age);
    }
}
