public class kadane {
    public static int[] maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new int[]{maxSum, start, end};
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, 2, 1, -5, -3};
        int[] result = maxSubArray(nums);
        System.out.println("Max Sum: " + result[0]);
        System.out.println("Start Index: " + result[1]);
        System.out.println("End Index: " + result[2]);
    }
}
