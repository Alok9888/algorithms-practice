class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder(); 

        recurse(ans, curr, n, open, close);
        return ans;
    }

    private void recurse(List<String> ans, StringBuilder curr, int n, int open, int close){
        if(open == n && close == n){
            ans.add(curr.toString());
            return;
        }

        if(open < n){
            curr.append('(');
            open++;
            recurse(ans, curr, n, open, close);
            curr.deleteCharAt(curr.length() - 1);
            open--;
        }if(close < open){
            curr.append(')');
            close++;
            recurse(ans, curr, n, open, close);
            curr.deleteCharAt(curr.length() - 1);
            close--;
        }
    }
}