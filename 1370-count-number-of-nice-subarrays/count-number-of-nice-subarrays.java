class Solution {
    private int temp(int[] nums, int k){
        int n = nums.length;
        int left = 0;
        int right = 0;
        int count = 0, ans = 0;

        while(right < n){
            if(nums[right]%2 == 1) count++;
            while(left <= right && count>k){
                if(nums[left]%2 == 1) count--;
                left++;
            }
            ans += right - left + 1;
            right++;
        }

        return ans;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return temp(nums, k) - temp(nums, k-1);
    }
}
