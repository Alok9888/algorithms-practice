class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int suffix = nums[n-1];
        int prefix = nums[0];
        int curr = 1;
        int currRev = 1;
        for(int i=0; i<nums.length; i++){
            curr*=nums[i];
            currRev *= nums[n-1-i];

            prefix = Math.max(prefix, curr);
            suffix = Math.max(suffix, currRev);

            if(curr == 0) curr = 1;
            if(currRev == 0) currRev = 1;
        }
        return Math.max(prefix, suffix);
    }
}





