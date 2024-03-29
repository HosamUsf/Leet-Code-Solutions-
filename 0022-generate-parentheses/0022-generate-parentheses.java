import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("", 0, 0, n, result);        
        return result;

    }

    private void generateParenthesisHelper(String current, int openCount, int closeCount, int n, List<String> result) {
        // Base case: if the length of the current string is 2*n
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add an open parenthesis if the count of open parentheses is less than n
        if (openCount < n) {
            generateParenthesisHelper(current + "(", openCount + 1, closeCount, n, result);
        }

        // Add a close parenthesis if the count of close parentheses is less than open parentheses
        if (closeCount < openCount) {
            generateParenthesisHelper(current + ")", openCount, closeCount + 1, n, result);
        }
    }

  

}