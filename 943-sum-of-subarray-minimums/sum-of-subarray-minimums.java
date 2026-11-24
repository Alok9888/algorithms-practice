class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        Arrays.fill(left, -1);
        int[] right = new int[n];
        Arrays.fill(right, n);
        long sum = 0;
        int MOD = 1000000007;

        stack.push(0);
        for(int i=1; i<n; i++){
            //no dups allowed
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                int index = stack.pop();
                right[index] = i;
            }
            stack.push(i);    
        }

        stack.clear();
        stack.push(n-1);
        for(int i=n-2; i>=0; i--){
            //dups allowed
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                int index = stack.pop();
                left[index] = i;
            }
            stack.push(i);
        }
        for(int i=0; i<n; i++){
           long count = (long) (i-left[i]) * (right[i]-i);
           sum = (sum + (long)arr[i] * count) % MOD;
        }

        return (int)sum;
    }
}