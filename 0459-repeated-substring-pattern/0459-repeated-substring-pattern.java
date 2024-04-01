class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int size=1;size<=s.length()/2;size++) {
            if (s.length()%size==0) {
                String curr=s.substring(0,size);
                int j=size;
                while (j<s.length() && s.substring(j,j+size).equals(curr)) {
                    j+=size;
                }
                if (j==s.length()) return true;
            }
        }
        return false;
        
    }
}