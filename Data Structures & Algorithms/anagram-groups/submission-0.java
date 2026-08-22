class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String a: strs)
        {
            String key = sortedString(a);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(a);
        }

        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    String sortedString(String a) {
        char[] c = a.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        for(char i:c){
            sb.append(i);
        }
        return sb.toString();
    }
}
