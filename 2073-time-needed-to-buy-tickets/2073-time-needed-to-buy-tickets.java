class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while(tickets[k] > 0){
            for(int i = 0; i < tickets.length;i++){
                if(tickets[i] ==0 )
                    continue;

                if(tickets[k] ==0 )
                    return time; 
                
                tickets[i]--;
                time++;
            }
            
        }
        return time;
    }
}