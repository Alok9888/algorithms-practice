class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int left = 0;
        int right = 0;
        int ans = 0;
        leftMax[0] = 0; rightMax[n-1] = 0;

        for(int i=1; i<n; i++){
            left = Math.max(left, height[i-1]);
            leftMax[i] = left;
        }
        for(int i=n-2; i>=0; i--){
            right = Math.max(right, height[i+1]);
            rightMax[i] = right;
        }

        for(int i=1; i<n-1; i++){
            if(leftMax[i] > height[i] && rightMax[i] > height[i]){
                ans += Math.min(leftMax[i], rightMax[i]) - height[i];
            }
        }
        return ans;
    }
}