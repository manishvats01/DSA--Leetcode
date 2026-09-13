import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int x : nums) {
            sum += x;
            min = Math.min(min, x);
        }

        if (k % 2 == 1)
            sum -= 2 * min;

        return sum;
    }
}