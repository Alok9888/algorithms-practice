class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}