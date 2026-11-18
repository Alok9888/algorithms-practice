class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = 0;

        while(left <= right){
            int middle = left + (right - left) / 2;
            
            if(nums[middle] > nums[right]){
                left = middle + 1;
                continue;
            }else if(nums[middle] > nums[left]){
                right = middle - 1;
                continue;
            }else{
                ans = nums[middle];
            }
            left++;
            right--;
        }
        return ans;
    }
}