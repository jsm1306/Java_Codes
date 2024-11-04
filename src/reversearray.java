public class reversearray {
    public static void main(String[] args) {
        int[] array = {9, 7, 3, 2, 10};
        int n = array.length;
        System.out.println("Normal Array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + " ");
        }
            for (int i = 0; i < n / 2; i++) {
                int temp = array[i];
                array[i] = array[n - i - 1];
                array[n - i - 1] = temp;
            }
            System.out.println("\nReversed Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

