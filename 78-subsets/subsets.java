class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        recurse(nums, 0, n, ans, curr);
        return ans;
    }
    private void recurse(int[] nums, int startIndex, int n, List<List<Integer>> ans, List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for(int i=startIndex; i<n; i++){
            curr.add(nums[i]);
            recurse(nums, i+1, n, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}