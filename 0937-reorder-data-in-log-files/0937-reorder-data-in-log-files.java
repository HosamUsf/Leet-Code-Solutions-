import java.util.Arrays;
class Solution {
    public String[] reorderLogFiles(String[] logs) {
         Arrays.sort(logs, (log1, log2) -> {
        // Split logs into identifier and content
        String[] split1 = log1.split(" ", 2);
        String[] split2 = log2.split(" ", 2);

        // Check if the logs are letter-logs or digit-logs
        boolean isLetterLog1 = Character.isLetter(split1[1].charAt(0));
        boolean isLetterLog2 = Character.isLetter(split2[1].charAt(0));

        if (isLetterLog1 && isLetterLog2) {
            // Both are letter-logs, compare their contents first
            int contentComparison = split1[1].compareTo(split2[1]);
            if (contentComparison != 0) {
                return contentComparison;
            }

            // If contents are the same, compare identifiers
            return split1[0].compareTo(split2[0]);
        } else if (isLetterLog1) {
            // Letter-logs come before digit-logs
            return -1;
        } else if (isLetterLog2) {
            // Digit-logs come after letter-logs
            return 1;
        } else {
            // Both are digit-logs, maintain relative ordering
            return 0;
        }
    });

    return logs;
    }
}