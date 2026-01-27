import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            // If it's the same number, just skip (don't break the streak, don't add to it)
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // If it's consecutive (1, 2, 3...)
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } 
            // Sequence broke
            else {
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1; // Reset to 1 (the current number itself)
            }
        }

        // Final check in case the longest sequence ends at the very last element
        return Math.max(longestStreak, currentStreak);
    }
}