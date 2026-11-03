class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int n = nums.length;
        int sum = 0, ans = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            int required = sum - k;
            if(mpp.containsKey(required)){
                ans+=mpp.get(required);
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}