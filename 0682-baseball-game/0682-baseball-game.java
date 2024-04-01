class Solution {
    public int calPoints(String[] operations) {
         int sum=0;
        List<Integer> op =new ArrayList<>();
        for (int i=0;i<operations.length;i++) {
            for (char x : operations[i].toCharArray()) {
                if (Character.isDigit(x)) {
                    op.add(Integer.parseInt(operations[i]));
                    break;
                }
            }
            switch (operations[i]) {
                case "+":
                    op.add(op.get(op.size()-1)+op.get(op.size()-2));
                    break;
                case "C":
                    op.remove(op.size()-1);
                    break; 
                case "D":
                    op.add(op.get(op.size()-1)*2);
                    break;
            }
        }
        for (int i = 0; i < op.size() ; i++) {
            sum+=op.get(i);
        }
        return sum;
    }
}