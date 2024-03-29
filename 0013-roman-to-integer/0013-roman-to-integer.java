class Solution {
    public int romanToInt(String s) {
          Map<Character,Integer> romanNumbers=new HashMap<>()
        {{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};

        int sum = 0 ; 
        for(int i = 0; i < s.length()-1; i++) {
            if(romanNumbers.get(s.charAt(i)) >= romanNumbers.get(s.charAt(i+1))){
                sum+=romanNumbers.get(s.charAt(i));

            } else {
                sum-=romanNumbers.get(s.charAt(i));

            }
        }
        return sum+=romanNumbers.get(s.charAt(s.length()-1));
    }
}