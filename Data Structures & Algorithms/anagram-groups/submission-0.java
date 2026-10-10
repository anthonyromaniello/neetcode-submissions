class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringMap = new HashMap<>();
        for (String s : strs) {
           int[] count = new int[26];
           for (char c : s.toCharArray()){
            count[c - 'a']++;
           }
           String key = Arrays.toString(count);
           stringMap.putIfAbsent(key, new ArrayList<>());
           stringMap.get(key).add(s);
        }
        return new ArrayList<>(stringMap.values());
    }
}
