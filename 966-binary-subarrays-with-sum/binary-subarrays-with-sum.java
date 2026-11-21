class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int sum = 0, ans = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        for(int i=0; i<n; i++){
            sum += nums[i];
            int req = sum - goal;
            if(mpp.containsKey(req)){
                ans += mpp.get(req);
            }

            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}