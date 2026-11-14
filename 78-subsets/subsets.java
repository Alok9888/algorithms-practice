class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recurse(nums, 0, curr, ans);
        return ans;
    }

    public void recurse(int[] nums, int startIndex, List curr, List ans){
        ans.add(new ArrayList<>(curr));

        for(int i=startIndex; i<nums.length; i++){
            curr.add(nums[i]);
            recurse(nums, i+1, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}