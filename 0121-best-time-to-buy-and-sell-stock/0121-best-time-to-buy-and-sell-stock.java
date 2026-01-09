class Solution {
    public int maxProfit(int[] prices) {

        int l = 0;
        int r = 1;
        int out = 0;

        while (r < prices.length) {
            int profit = prices[r] - prices[l];

            if (profit > 0) {
                out = Math.max(out, profit);
            } else {
                l = r;
            }

            r++;
        }

        return out;
    }
}
