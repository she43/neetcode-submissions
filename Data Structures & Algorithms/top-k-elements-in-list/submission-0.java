class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i)+1);
        }

       // 1. Create a list of the unique numbers
        List<Integer> uniqueNums = new ArrayList<>(map.keySet());

        // 2. Sort the list using a custom comparator based on frequency
        uniqueNums.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            // Sort in descending order of frequency
            return Integer.compare(freqB, freqA); 
        });

        // 3. Extract the top k elements into an int array
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = uniqueNums.get(i);
        }
        return ans;
    }


}
