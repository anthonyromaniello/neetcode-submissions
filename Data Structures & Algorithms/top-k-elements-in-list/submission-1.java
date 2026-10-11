class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];
        
        int[] result = new int[k];

        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum); 
        }

        for (Map.Entry<Integer, Integer> count : countMap.entrySet()) {
            frequency[count.getValue()].add(count.getKey());
        }

        int targetIndex = 0;
        for (int i = frequency.length -1; i >= 0; i--) {
            for (int n : frequency[i]) {
                result[targetIndex++] = n;
                if (targetIndex == k) {
                    return result;
                }
            }      
        }
        return result;
    }
}
