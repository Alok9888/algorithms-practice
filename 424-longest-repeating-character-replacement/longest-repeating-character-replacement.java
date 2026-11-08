class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, r = 0;
        int maxFreq = 0;
        int ans = 0;
        char[] ch = s.toCharArray();
        while(r < ch.length){
            freq[ch[r]-'A'] += 1;
            maxFreq = Math.max(maxFreq, freq[ch[r] - 'A']);
            while(((r-l+1) - maxFreq) > k){
                freq[ch[l] - 'A'] -= 1;
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}