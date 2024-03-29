class Solution {
    public String mergeAlternately(String word1, String word2) {
         String y="";
        for (int i = 0; i <word1.length()&&i<word2.length(); i++) {
            y=y+word1.charAt(i);
            y=y+word2.charAt(i);
        }

        if(word1.length()>word2.length()) {
            y=y+word1.substring(word2.length());
        } else if(word1.length()<word2.length()){
            y=y+word2.substring(word1.length());
        }
        return y;
        
    }
}