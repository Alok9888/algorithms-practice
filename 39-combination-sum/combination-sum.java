class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int sum = 0;

        recurse(candidates, 0, sum, target, curr, ans);
        return ans;
    }

    private void recurse(int[] nums, int startIndex, int sum, int target, List<Integer> curr, List<List<Integer>> ans){
        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }if(sum > target) return;

        for(int i=startIndex; i<nums.length; i++){  
            curr.add(nums[i]);
            sum += nums[i];

            recurse(nums, i, sum, target, curr, ans);

            sum -= curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);

        }
    }
}