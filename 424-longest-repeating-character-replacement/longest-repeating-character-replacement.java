class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, r = 0;
        int maxFreq = 0;
        int ans = 0;
        char[] ch = s.toCharArray();
        Character maxFreqChar = null;
        while(r < ch.length){
            freq[ch[r]-'A'] += 1;
            if(maxFreq <= freq[ch[r] - 'A']){
                maxFreq = freq[ch[r] - 'A'];
                maxFreqChar = ch[r];
            }
            while(((r-l+1) - maxFreq) > k){
                freq[ch[l] - 'A'] -= 1;
                if(ch[l] == maxFreqChar){
                    maxFreq = 0;
                    for(int i=0; i<26; i++){
                        maxFreq = Math.max(maxFreq, freq[i]);
                    }
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}


