class Solution {
    public char findTheDifference(String s, String t) {

           char sum = 0;
        for (char c : t.toCharArray()) {
            sum += c;
        }


        for (char c : s.toCharArray()) {
            sum -= c;
        }

        return (char) sum;
    }
}