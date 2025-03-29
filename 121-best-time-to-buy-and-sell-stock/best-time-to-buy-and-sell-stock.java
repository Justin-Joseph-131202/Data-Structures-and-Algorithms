class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minStart = prices[0];

        for(int i=1;i<n;i++){
            minStart = Math.min(minStart,prices[i]) ;
        
            maxProfit = Math.max(maxProfit , prices[i] - minStart ) ;
        }
         return maxProfit ;
        
    }
}