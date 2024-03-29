class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k] ; 
    }
}




/*
list 1 
list 2 
int sum ; 
for (i = n.lenght - 1 ; i>=0 ; i--){
    int curr = Integer.parseInt(billingValues[i]);
    int taken = 0 ;
    while (taken < billingcount[i] && s+curr <= withdraw){
        s+=curr;
        taken++;
    }
    if(taken > 0){
        list 1 .add taken
        list 2 add curr
    }

    if(s == withdraw){
        break;
    }

    string builder s ;
    for(int i =0 ; i< list.size ; i++){
        s.append(list1.get(i) + "X" + list2.get(i))
        if (i != list.size-1) {
            s.append "," 
        }
    }
    return s==withdraw ? s.toString  : -1 ;
}



 */