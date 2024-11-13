public class finally_multiple_catch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int num1 = 10;
        int num2 = 0;
        try {
            System.out.println(numbers[3]);
            System.out.println(num1 / num2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Multiple catch blocks executed.");
        }
    }
}
