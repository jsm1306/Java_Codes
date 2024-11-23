public class throwexample {
    public static void main(String[] args) {
        throwexample ex = new throwexample();
        int num = 12, deno = 0;
        try {
            ex.check(num, deno);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Executed succesfully");
    }

    public void check(int num, int deno) {
        if (deno == 0) {
            throw new ArithmeticException("Arithmetic Exception cant divide by zero");
        }
        System.out.println(num / deno);
    }
}
