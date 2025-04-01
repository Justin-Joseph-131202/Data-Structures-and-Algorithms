class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length ;
        
        
        
        int SUM = Sum(nums , n) ;
        int minSum = KadanesMin( nums , n) ;
        int maxSum = KadanesMax( nums , n ) ;
        int circularMaxSum = SUM - minSum ;
        
        if(maxSum > 0 ) {
            return Math.max(maxSum, circularMaxSum);
        }
        
        return maxSum ;
    }
    
    
    int KadanesMax(int[] nums , int n ){
            int sum = nums[0];
            int maxSum = nums[0] ;
            
            for(int i = 1 ; i<n;i++){
                sum = Math.max(sum+nums[i] , nums[i]);
                maxSum = Math.max(maxSum , sum );
            }
            return maxSum ;
            
    }
        
        int KadanesMin(int[] nums, int n ) {
            int sum = nums[0];
            int minSum = nums[0];
            
            for(int i = 1 ; i<n;i++){
                sum = Math.min(sum+nums[i] , nums[i]);
                minSum = Math.min(minSum , sum );
            }
            return minSum ;
            
            
        }
        
        int Sum(int[] nums , int n ) {
            int sum = 0;
            for(int i : nums ){
                sum += i ;
            }
            return sum ;
        }
        
}