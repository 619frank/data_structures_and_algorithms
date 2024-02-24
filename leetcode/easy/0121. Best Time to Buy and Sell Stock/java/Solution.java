class Solution {
    public int maxProfit(int[] prices) {
        int currentMinimum = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){

            currentMinimum = Math.min(prices[i], currentMinimum);
            profit = Math.max(profit, (prices[i] - currentMinimum));
        }

        return profit;
    }
}