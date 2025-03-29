class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minStart = prices[0];

        for(int i=1;i<n;i++){
            minStart = Math.min(minStart,prices[i]) ;

            int profit = prices[i] - minStart ;
        
            
            maxProfit = Math.max(maxProfit , profit ) ;
        }
         return maxProfit ;
        
    }
}