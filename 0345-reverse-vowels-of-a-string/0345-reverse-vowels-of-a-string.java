class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] charArray = s.toCharArray();
        
        int l = 0;
        int r = s.length() - 1;
        
        while (l < r) {
            while (l < r && vowels.indexOf(charArray[l]) == -1) {
                l++;
            }
            
            while (l < r && vowels.indexOf(charArray[r]) == -1) {
                r--;
            }
            
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            
            l++;
            r--;
        }
        
        return new String(charArray);
    }
}
