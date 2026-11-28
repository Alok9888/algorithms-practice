class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Map<Character, Integer> mpp = new HashMap<>();

        for(char c : ch1){
            mpp.put(c, mpp.getOrDefault(c, 0)+1);
        }

        for(char c : ch2){
            if(mpp.containsKey(c)){
                mpp.put(c, mpp.get(c)-1);
                if(mpp.get(c)<0) return false;
            }else{
                return false;
            }
        }

        for(Map.Entry<Character, Integer> e : mpp.entrySet()){
            if(e.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}