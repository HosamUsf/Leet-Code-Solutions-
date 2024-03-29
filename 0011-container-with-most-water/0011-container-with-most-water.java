class Solution {
    public int maxArea(int[] height) {
        int l =0 ;
        int result = 0 ;
        int area;
        int r = height.length -1;
        while(l < r ){
            area = (r-l) * Math.min(height[l] ,height[r]);
            result = Math.max(result,area);
            if(height[r] > height[l]) l++ ;
            else r-- ;
        }

        return result ;
    }
}