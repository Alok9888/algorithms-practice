class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recurse(nums, arr, ans, 0, n);
        return ans;
    }

    private void recurse(int[] nums,List arr, List ans, int i, int n){
        if(i == n){
            ans.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[i]);
        recurse(nums, arr, ans, i+1, n);
        arr.remove(arr.size()-1);
        recurse(nums, arr, ans, i+1, n);
    }
}