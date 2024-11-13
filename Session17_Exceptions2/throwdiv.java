public class throwdiv {
    public static void main(String[] args) {
        throwdiv div = new throwdiv();
        try {
            div.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
