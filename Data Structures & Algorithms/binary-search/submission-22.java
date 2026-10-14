class Solution {
    public int search(int[] nums, int target) {
        int currentIndex = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums.length > 1) {
                currentIndex = left + (right - left) / 2;
            }
            System.out.println(currentIndex);
            if (nums[currentIndex] == target) {
                return currentIndex;
            }else if (nums[currentIndex] < target) {
                left = currentIndex + 1;
            }else {
                right = currentIndex -1;
            }
        }
        return -1;
    }
}
