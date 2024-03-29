class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i =0 ; i<n ; i++){
            nums1[m++] = nums2[i];
        }

        for(int i = 0 ; i<nums1.length-1 ; i++){
            int temp = 0;
            if(nums1[i] > nums1[i+1]){
                temp=nums1[i];
                nums1[i] =  nums1[i+1];
                 nums1[i+1]=temp;
                 i = -1;
            }
        }
        

        
        
    }
}