class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      int n = candidates.length;
      Arrays.sort(candidates);
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> curr = new ArrayList<>();
      int sum = 0, startIndex = 0;
      recurse(candidates, target, n, sum, startIndex, ans, curr);
      return ans;
    }

    private void recurse(int[] nums, int target, int n, int sum, int startIndex, List<List<Integer>> ans, List<Integer> curr){
        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(sum > target){
            return;
        }

        for(int i=startIndex; i<n; i++){
            if(i>startIndex && nums[i] == nums[i-1]){
                continue;
            }
            sum+=nums[i];
            curr.add(nums[i]);
            recurse(nums, target, n, sum, i+1, ans, curr);

            sum-=curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);
        }
    }
}