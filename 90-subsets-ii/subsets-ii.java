class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        recurse(nums, n, 0, ans, curr);
        return ans; 
    }

    private void recurse(int[] nums, int n, int startIndex, List<List<Integer>> ans, List<Integer> curr){
        ans.add(new ArrayList<>(curr));

        for(int i=startIndex; i<n; i++){
            if(i > startIndex && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);

            recurse(nums, n, i+1, ans, curr);

            curr.remove(curr.size() - 1);
        }
    }
}


