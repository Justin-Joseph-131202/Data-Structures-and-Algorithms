class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }  

        int maxProfit = 0;
        int minStart = prices[0];

        for (int price : prices) { 
            if (price < minStart) {
                minStart = price; 
            } else {
                maxProfit = Math.max(maxProfit, price - minStart);
            }
        }
        
        return maxProfit;
    }
}