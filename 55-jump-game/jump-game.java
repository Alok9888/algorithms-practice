class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        int maxReach = 0;
        for(int i=0; i<=maxReach; i++){
            if(nums[i] >= n-(i+1)){
                return true;
            }else{
                for(int j=1; j<=nums[i]; j++){
                    maxReach = Math.max(maxReach, i+j);
                }
            }
        }
        return false;
    }
}