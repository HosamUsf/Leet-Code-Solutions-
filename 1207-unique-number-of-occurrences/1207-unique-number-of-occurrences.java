class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<>();

    for(int i : arr){
        numbers.put(i ,numbers.getOrDefault(i , 0) + 1);
    }

    HashSet<Integer> unique = new HashSet<>(numbers.values());
    return unique.size()==numbers.size();

    }
}