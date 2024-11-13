public class except2 {
    public static void main(String a[]) {
        int i = 4, j = 0;
        int nums[] = new int[5];
        try {
            i = 18 / 1;
            System.out.println(nums[1]);//this will be executed
            System.out.println(nums[5]);//this error will be raised
        } catch (ArithmeticException p) {
            System.out.println("Cannot divide by zero");
            System.out.println("Stay in your limit." + p);
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
