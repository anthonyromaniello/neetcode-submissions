class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indicesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indicesMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (indicesMap.containsKey(difference) && indicesMap.get(difference) != i) {
                    int[] indices = {i, indicesMap.get(difference)};
                    return indices;
            }
        }
        return new int[]{10000, 10000};
    }
}
