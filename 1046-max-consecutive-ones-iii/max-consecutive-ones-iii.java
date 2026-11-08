class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int len = 0;
        int maxLen = 0;
        int n = nums.length;
        int limit = k;
        while(r < n){
            while(l < r && (k==0 && nums[r] == 0)){
                if(nums[l] == 0){
                    if(k < limit){
                        k++;
                    }
                }
                l++;
            }

            // NEW: after shrinking, if we are still stuck on a bad 0
            if(k == 0 && nums[r] == 0){
                l = r + 1; // skip this 0 completely
                r++;
                continue; // don't do k--, don't update maxLen
            }

            if(nums[r] == 0){
                k--;
            }
            maxLen = Math.max(maxLen, (r-l) + 1);
            r++;
        }
        return maxLen;
    }
}