class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[1]));

        int endIndex = intervals[0][1];
        int n = intervals.length;

        int ans = 0;

        for(int i=1; i<n; i++){
            if(intervals[i][0] < endIndex){
                ans++;
            }
            else{
                endIndex = intervals[i][1] > intervals[i-1][1] ? intervals[i][1] : intervals[i-1][1];
            }
        }
        return ans;
    }
}