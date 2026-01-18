class Solution {
    public int[] rearrangeArray(int[] nums) {
        int po = 0, ne = 0;
        int l = nums.length;

        int p[] = new int[l];
        int n[] = new int[l];
        int ans[] = new int[l];

        for (int j = 0; j < l; j++) {
            if (nums[j] < 0) {
                n[ne++] = nums[j];
            } else {
                p[po++] = nums[j];
            }
        }

        for (int i = 0; i < po; i++) {
            ans[2*i]   = p[i];
            ans[2*i+1] = n[i];
        }

        return ans;
    }
}
