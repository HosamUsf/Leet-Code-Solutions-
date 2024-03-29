class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int i  : nums){
            set.add(i);
        }
        
        for(int i = 0 ; i< nums.length ; i++){
            int count = 1;

            // look left
            int num = nums[i];
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }


            // look right
            num = nums[i];
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }

            result = Math.max(count , result);
        }
        
        return result;

    }
}