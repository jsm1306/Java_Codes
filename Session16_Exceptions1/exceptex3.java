public class exceptex3 {
    public static void main(String a[]) {
        int i = 0, j = 0;
        String str = null;
        int[] nums = new int[5];
        try {
            i = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        } catch (NullPointerException e) {
            System.out.println("String is null, cannot call length()");
        } catch (Exception e) {
            System.out.println("Something Went wrong.. " + e);
        }
    }
}
