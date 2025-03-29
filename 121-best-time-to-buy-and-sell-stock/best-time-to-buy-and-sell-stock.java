class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minStart = prices[0];

        for(int  price : prices){
            minStart = Math.min(minStart,price) ;
        
            maxProfit = Math.max(maxProfit , price - minStart ) ;
        }
         return maxProfit ;
        
    }
}