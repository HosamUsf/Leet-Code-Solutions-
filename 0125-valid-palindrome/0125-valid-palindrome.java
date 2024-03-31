class Solution {
    public boolean isPalindrome(String s) {
        String new_string = s.replaceAll("\\W+", "");
        new_string = new_string.replaceAll("_", "");

        
        if(new_string.length() <=1) {
            return true;
        }
        new_string = new_string.toLowerCase();

        for(int i = 0;i<new_string.length();i++){
            if(new_string.charAt(i) !=new_string.charAt(new_string.length()-1-i) ){
                return false;
            }
        }

        return true;
    }
}