class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            if (frequencyMap.containsKey(num)) return true;
            frequencyMap.put(num, 1);
        }

        return false;
    }
}