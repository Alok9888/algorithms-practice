class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        int n = s.length();
        if(n != t.length()) return false;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        for(int i=0; i<n; i++){
            if(!map1.containsKey(ch1[i])){
                map1.put(ch1[i], ch2[i]);
            }else{
                if(map1.get(ch1[i]) != ch2[i]) return false;
            }

            if(!map2.containsKey(ch2[i])){
                map2.put(ch2[i], ch1[i]);
            }else{
                if(map2.get(ch2[i]) != ch1[i]) return false;
            }
        }

        return true;

    }
}