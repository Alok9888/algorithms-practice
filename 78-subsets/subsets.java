class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        recurse(nums, 0, n, ans, curr);
        return new ArrayList<>(ans);
    }
    private void recurse(int[] nums, int startIndex, int n, Set<List<Integer>> ans, List<Integer> curr){
        if(startIndex >= n){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=startIndex; i<n; i++){
            curr.add(nums[i]);
            recurse(nums, i+1, n, ans, curr);
            curr.remove(curr.size() - 1);
            ans.add(new ArrayList<>(curr));
        }
    }
}