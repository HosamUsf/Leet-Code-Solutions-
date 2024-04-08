class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int top = 0 ;
        int count  = 0 ; 
        for(int i : students){
            q.add(i);
        }

        while(!q.isEmpty() && q.size() != count ){
            if(q.peek() == sandwiches[top]){
                count=0;
                top++;
                q.remove();
            } else {
                count++;
                q.add(q.remove());
            }
        }

        return q.size();
    }
}