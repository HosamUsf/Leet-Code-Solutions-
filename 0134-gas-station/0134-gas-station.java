class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            // If the tank becomes negative, reset the start index
            if (tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }

        // Check if it's possible to complete the circuit
        if (totalGas >= totalCost) {
            return start;
        } else {
            return -1;
        }
    }
}
