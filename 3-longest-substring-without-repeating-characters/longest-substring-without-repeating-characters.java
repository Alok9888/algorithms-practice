class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int maxLength = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++){
            while(set.contains(ch[i])){
                set.remove(ch[j]);
                j++;
            }
            set.add(ch[i]);
            maxLength = Math.max(maxLength, i-j+1);
        }
        return maxLength;
    }
}