class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int sum = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<n; i++){
            sum += nums[i]%2;
            int req = sum - k;
            if(map.containsKey(req)){
                ans += map.get(req); 
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }       
        return ans;

       
    }
}