class Solution {
    public int strStr(String haystack, String needle) {
       
        for(int i = 0 ;i <= haystack.length()-needle.length() ;i++){
            int j =0;
            if(needle.charAt(0) == haystack.charAt(0+i)){
            for( j = 0 ; j < needle.length(); j++){
                    if(needle.charAt(j) != haystack.charAt(j+i)){
                        break;
                    }
                } 
            }
            if(j == needle.length()){
                return i ;
            }
        }
        return -1;
    }
}
