/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1 ; 
        int r = n;
        
        while(l <= r ){
            int  mid = l + (r - l) / 2;
            if(isBadVersion(mid) == true && isBadVersion(mid-1) == false){
               return mid ; 
            } else if(isBadVersion(mid)){
              r = mid ;
            } else {
                l = mid + 1 ;
            }
        }
       
        return -1 ;
    }
}