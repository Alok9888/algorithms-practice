class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        char []ch = s.toCharArray();
        int []freq = new int[3];
        int left = 0, right = 0;
        int ans = 0;

        while(right < n){
            freq[ch[right] - 'a']++;
            if(freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1) ans+= n - right;

            while(left<right && (freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1)){
                freq[ch[left] - 'a']--;
                if(freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1) ans+= n - right;
                left++;
            }
            right++;
        }
        return ans;
    }
}