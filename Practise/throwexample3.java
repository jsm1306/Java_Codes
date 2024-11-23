public class throwexample3 {
    public static void main(String[] args) {
        int age = 8;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } finally {
            System.out.println("Age checking done");
        }
    }
}
