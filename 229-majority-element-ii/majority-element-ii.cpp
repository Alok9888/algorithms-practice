class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        int cnd1 = 0, cnt1 = 0;
        int cnd2 = 0, cnt2 = 0;
        for(auto num:nums){
            if(num == cnd1) cnt1++;
            else if(num == cnd2) cnt2++;
            else if(cnt1 == 0) cnd1 = num, cnt1 = 1;
            else if(cnt2 == 0) cnd2 = num, cnt2 = 1;
            else cnt1--, cnt2--;
        }
        
        cnt1 = cnt2 = 0;
        for(auto num : nums){
            if(num == cnd1) cnt1++;
            else if(num == cnd2) cnt2++;
        }

        int n = nums.size();
        if(cnt1 > n/3) ans.push_back(cnd1);
        if(cnt2 > n/3) ans.push_back(cnd2);

        return ans;
    }
};