class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        for(int i=n-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                for(int j=n-1; j>=i; j--){
                    if(nums[j] > nums[i-1]){
                        swap(nums, i-1, j);
                        break;
                    }
                }
                reverse(nums, i, n-1);
                return;
            }
        }
        reverse(nums, 0, n-1);
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}