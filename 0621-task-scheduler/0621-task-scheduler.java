class Solution {
    public int leastInterval(char[] tasks, int n) {
        int result = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();

         for (char c : tasks) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        int maxFrequency = Integer.MIN_VALUE;

        for (int frequency : charMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }  

        System.out.println("maxFrequency");

        System.out.println(maxFrequency);


        int idleSlots = n * (maxFrequency - 1);
        idleSlots += maxFrequency -1;
        System.out.println("idleSlots");
        System.out.println(idleSlots);

        for (int frequency : charMap.values()) {
            idleSlots -= Math.min(frequency, maxFrequency -1);
            System.out.println(idleSlots);

        }

        

        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}