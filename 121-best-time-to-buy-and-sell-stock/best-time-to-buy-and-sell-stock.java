class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];

        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int currentProfit = prices[i] - minPrice;

            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }
}