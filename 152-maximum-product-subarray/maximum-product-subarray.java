class Solution {
    public int maxProduct(int[] nums) {
        int currProdPrefix = 1 ;
        int currProdSuffix = 1 ;
        int maxProd = Integer.MIN_VALUE;
        int n = nums.length ;
        for(int i = 0; i<n;i++){
            currProdPrefix *= nums[i] ;
            currProdSuffix *= nums[n-i-1] ;
            maxProd = Math.max(maxProd , Math.max(currProdPrefix , currProdSuffix ));
            if (currProdPrefix == 0) {
                currProdPrefix = 1;
            }
            if (currProdSuffix == 0){
                currProdSuffix = 1 ;
            }
        }
        
        return maxProd ;
    }
}