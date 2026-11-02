class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() - 1;
        boolean isPal = true;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                isPal = false;
            }
            i++;
            j--;
        }
        return isPal;
    }
}