class Solution {
    public boolean isHappy(int n) {
        var fast = n ; 
        var slow = n; 
        while (fast !=1 || slow  !=1){
            fast = sum(fast);
            fast = sum(fast);
            slow = sum(slow);

            if(fast == slow && slow !=1 ) return false ;
            
        }
        return true ;
    }

    private int sum(int n) {
           int sum = 0;
            while (n!= 0){
            int digit =n%10;
             sum += digit * digit;
             n /= 10;
        }
            n=sum;
            return n;
    }
}



/*
    Set<Integer> seen = new HashSet<>();
        int result= n;
        while (result != 1 && !seen.contains(result)){
            seen.add(result);
            int sum = 0;
            while (result!= 0){
            int digit =result%10;
             sum += digit * digit;
             result /= 10;
        }
            result=sum;

        }
        return result ==1;
         */