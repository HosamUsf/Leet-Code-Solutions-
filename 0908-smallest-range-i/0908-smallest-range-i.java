class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];
        for(int i =0; i < nums.length ; i++ ){
            minVal = Math.min(minVal, nums[i]);
            maxVal = Math.max(maxVal, nums[i]);
        }
        if(minVal + k >= maxVal - k){
            return 0;
        }else{
            return(maxVal - k ) - (minVal + k);
        }
    }
}