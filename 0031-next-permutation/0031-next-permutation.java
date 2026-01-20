import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // 1. Find change point
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        // 2. If permutation exists
        if (i >= 0) {
            int j;
            for (j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    break;
                }
            }

            // 3. Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // 4. Sort suffix
        Arrays.sort(nums, i + 1, n);
    }
}
