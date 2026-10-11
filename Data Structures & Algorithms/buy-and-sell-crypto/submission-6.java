class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int minValue = prices[0];
        int bestProfit = 0;
        int currentProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            currentProfit = prices[i] - minValue;
            if (currentProfit > bestProfit) {
                bestProfit = currentProfit;
            }
            if (prices[i] < minValue) {
                minValue = prices[i];
                     
            }  
        }
        System.out.println(minValue);
        return bestProfit;
    }
}
