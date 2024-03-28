class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer>  window = new HashSet<Integer>();
        int l = 0;
        for(int i = 0 ;i<nums.length ;i++){
            if(i-l > k){
                
                window.remove(nums[l]);
                l++;
            }
            if(window.contains(nums[i])){
                return true;
            }else {
                window.add(nums[i]);
            }
                

        }
        return false;
    }
}