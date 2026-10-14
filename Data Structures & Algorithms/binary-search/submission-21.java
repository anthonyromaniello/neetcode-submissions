class Solution {
    public int search(int[] nums, int target) {
        int currentIndex = 0;
        if (nums.length < 1) {
            if (nums[currentIndex] == target) return 0;
            else return -1;
        } else {
            currentIndex = nums.length / 2;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            currentIndex = left + (right - left) / 2;
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
