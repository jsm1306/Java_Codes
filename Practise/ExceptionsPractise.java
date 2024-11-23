public class ExceptionsPractise {
    public static void main(String[] args) {
        int i = 18;
        int j = 0;
        try {
            int result = i / j;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
