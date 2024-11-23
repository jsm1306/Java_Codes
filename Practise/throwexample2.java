public class throwexample2 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        String str = null;
        int array[] = new int[5];
        try {
            System.out.println(array[1]);
            System.out.println(array[5]);
            System.out.println(str.length());
            int result = i / j;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong..." + e.getMessage());
        } finally {
            System.out.println("Division attempt is completed");
        }
        System.out.println("execution completed");
    }
}
