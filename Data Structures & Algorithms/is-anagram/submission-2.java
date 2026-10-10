class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        if ((s == null || t == null) || (s.length() != t.length())) return false;

        for (int i = 0; i < s.length(); i++) {
            frequencyMap.merge(s.charAt(i), 1, Integer::sum);
            frequencyMap.merge(t.charAt(i), -1, Integer::sum);
        }
        if (frequencyMap.values().stream().anyMatch(value -> value >= 1)) return false;
        else return true;
    }
}
