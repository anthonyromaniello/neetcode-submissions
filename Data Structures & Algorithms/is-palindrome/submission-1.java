class Solution {
    public boolean isPalindrome(String s) {
        
        String setUpS = s.replaceAll("\\s+|\\p{Punct}+", "").toLowerCase();
        int left = 0;
        int right = setUpS.length() - 1;

        while (right >= 0 && left < setUpS.length()) {
            if (setUpS.charAt(left) != setUpS.charAt(right)) return false;
            else {
                left++;
                right--;
            }   
        }
        return true;
    }
}
