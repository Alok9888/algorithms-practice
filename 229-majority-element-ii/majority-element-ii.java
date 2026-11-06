class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int num : nums){
            if(candidate1 == num) count1++;
            else if(candidate2 == num) count2++;
            else if(count1 == 0){
                candidate1 = num; 
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = num; 
                count2 = 1;
            }
            else{
               count1--;
               count2--;
            }
        }
        //Check the counts
        count1 = 0;
        count2 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == candidate1) count1++;
            else if(nums[i] == candidate2) count2++;
        }

        if(count1 > n/3) ans.add(candidate1);
        if(count2 > n/3) ans.add(candidate2);

        return ans;
    }
}

