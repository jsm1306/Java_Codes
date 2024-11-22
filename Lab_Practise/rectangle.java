public class rectangle {
    public static void main(String[] args) {
        System.out.println("The addition of two numbers is: " + add(5, 6));
        System.out.println("The addition of two numbers is: " + add(5.5, 6.5));
        System.out.println("The subtraction of two numbers is: " + sub(50, 6));
        System.out.println("The subtraction of two numbers is: " + sub(50.5, 26.5));
        System.out.println("The multiplication of two numbers is: " + mul(50, 40));
        System.out.println("The multiplication of two numbers is: " + mul(5.5, 2.5));
        System.out.println("The division of two numbers is: " + divide(5, 0));
        System.out.println("The division of two numbers is: " + divide(5.0, 2.5));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible");
            return 0;
        } else {
            return a / b;
        }
    }

    static double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Division by zero is not possible");
            return 0;
        } else {
            return a / b;
        }
    }
}