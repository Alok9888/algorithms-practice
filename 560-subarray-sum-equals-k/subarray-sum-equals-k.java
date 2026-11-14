class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0, ans  = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        for(int i=0; i<n; i++){
            sum += nums[i];
            int req = sum - k;
            if(freq.containsKey(req)){
                ans += freq.get(req);
            }
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}