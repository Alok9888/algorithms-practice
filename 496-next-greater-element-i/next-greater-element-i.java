class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n1 = nums1.length, n2 = nums2.length;
        for(int i=n2-1; i>=0; i--){
            int curr = nums2[i];
            while(!stack.empty() && curr > stack.peek()){
                stack.pop();
            }
            if(stack.empty()){
                map.put(curr, -1);
            }else{
                map.put(curr, stack.peek());
            }
            stack.push(curr);
        }
        for(int i=0; i<n1; i++){
            int curr = nums1[i];
            nums1[i] = map.get(curr);
        }
        return nums1;
    }
}