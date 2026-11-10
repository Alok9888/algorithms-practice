class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        maxSum = Math.max(sum, maxSum);
        for(int i=0; i<k; i++){
            sum -= cardPoints[k-i-1];
            sum += cardPoints[n-i-1];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}