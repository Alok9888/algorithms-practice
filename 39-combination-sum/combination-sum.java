class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int startIndex = 0;
        int sum = 0;

        recurse(candidates, startIndex, target, curr, ans, n, sum);

        return ans;
    }

    private void recurse(int[] candidates, int startIndex, int target, List<Integer> curr, List<List<Integer>> ans, int n, int sum){
        if(sum > target){
            return;
        }
        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=startIndex; i<n; i++){
            sum += candidates[i];
            curr.add(candidates[i]);

            recurse(candidates, i, target, curr, ans, n, sum);

            sum -= curr.get(curr.size()-1);
            curr.remove(curr.size()-1);
        }
    }
}