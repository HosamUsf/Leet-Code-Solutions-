class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0 ; 
        int maxsum = sum ; 
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] == 1){
                sum++ ;
                maxsum = Math.max(sum,maxsum);
            } else sum = 0;
            
        }
        return maxsum;
    }
}