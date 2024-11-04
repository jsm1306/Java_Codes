public class removeduplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int n = array.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }

}