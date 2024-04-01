class Solution {
    public int longestPalindrome(String s) {
        int sum = 0 ;
        boolean odd_found = false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (int c: map.values()) {
                if(c % 2 == 0) {
                sum += c;
            } else {
                sum += c -1 ;
                odd_found = true;
            }
        }
        
        if(odd_found) sum++ ;

        return sum ;
    }
}