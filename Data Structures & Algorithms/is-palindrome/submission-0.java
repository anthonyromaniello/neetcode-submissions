class Solution {
    public boolean isPalindrome(String s) {
        
        String setUpS = s.replaceAll("\\s+|\\p{Punct}+", "").toLowerCase();
        char[] flippedS = new char[setUpS.length()];
        int left = 0;
        int right = setUpS.length() - 1;

        while (right >= 0 && left < setUpS.length()) {
            flippedS[left] = setUpS.charAt(right);
            left++;
            right--;
        }
        System.out.println(setUpS);
        String flippedSConverted = new String(flippedS);
        System.out.println(flippedSConverted);

        if (setUpS.equals(flippedSConverted)) return true;
        else return false;
    }
}
