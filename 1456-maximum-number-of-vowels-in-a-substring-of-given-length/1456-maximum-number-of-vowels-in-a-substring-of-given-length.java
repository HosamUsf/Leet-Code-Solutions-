class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int result = 0;
        int count = 0;
        HashSet<Character> set= new HashSet<>();
                set.add('a');
                set.add('e');
                set.add('i');
                set.add('o');
                set.add('u');

        for(int right = 0; right < s.length(); right++){
            if(set.contains(s.charAt(right))){
                count++;
            }
            if(right - left + 1 == k ){
                result = Math.max(result, count);
                if (set.contains(s.charAt(left))) {
                    count--;
                }
                left++;
            }

        }
        return result;
    }
}