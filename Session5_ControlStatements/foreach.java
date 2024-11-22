public class foreach {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int x : array) {
            System.out.println("The value is: " + x);
            sum += x;
        }
        System.out.println("The sum of elements in the array is: " + sum);
    }
}
