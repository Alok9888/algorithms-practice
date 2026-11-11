class Solution {
    public boolean checkValidString(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        List<Integer> openPos = new ArrayList<>();
        List<Integer> starPos = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ch[i] == '('){
                openPos.add(i);
            }else if(ch[i] == '*'){
                starPos.add(i);
            }else{
                if(!openPos.isEmpty()) openPos.remove(openPos.size() - 1);
                else if(!starPos.isEmpty()){
                    starPos.remove(starPos.size() - 1);
                }else{
                    return false;
                }
            }
        }
        while(!openPos.isEmpty()){
            if(!starPos.isEmpty()){
                if(starPos.get(starPos.size() - 1) > openPos.get(openPos.size() - 1)){
                    openPos.remove(openPos.size() - 1);
                    starPos.remove(starPos.size() - 1);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}