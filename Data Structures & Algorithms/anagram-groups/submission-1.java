class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map= new HashMap<>();

        for(String s:strs) {
            int[] freq = new int[26];

            for(char c:s.toCharArray()) {
                freq[c-'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int i:freq) {
                key.append("#");
                key.append(i);
            }
            String ke = key.toString();
            map.putIfAbsent(ke, new ArrayList<>());
            map.get(ke).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
