class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int max = 0;

        for (int i = prices.length - 1; i >= 0 ; i--) {
            int price = prices[i];
            if (max > price) {
                //sell
                maxProfit = Math.max(maxProfit, max - price);
            } else {
                // buy
                max = price;
            }
        }

        return maxProfit;
    }
}
// Time O(N), Space O(1)