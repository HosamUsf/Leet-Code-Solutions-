class Solution {
    public int removeElement(int[] nums, int val) {
          int x = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[x] = nums[j];
                x++;
            }
        }
        return x;
    }
}