class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        int ans = 0, sum = 0;
        freq.put(0, 1);

        for(int i=0; i<n; i++){
            sum+=nums[i];
            int req = sum - k;
            if(freq.containsKey(req)){
                ans += freq.get(req);
            }
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}