class Solution {
    public void sortColors(int[] nums) {
        int mid, low, high ;
        low = 0;
        mid = 0;
        high = nums.length - 1;
        
        while(mid <= high){
            if(nums[mid]==0){
                swap( nums ,mid , low);
                mid++;
                low++;
            }
            
            else if(nums[mid]==1){
                mid++;
            }
            
            
            
            else{
                swap( nums ,  mid , high);
                high--;
            }
            
        }
    }


    public static void swap(int[] arr , int i , int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}