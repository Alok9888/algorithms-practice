class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator
                .<int[]>comparingInt(a -> a[1])
                .thenComparingInt(a -> a[0]));
        int n = intervals.length;
        int endIndex = intervals[0][1];
        int operations = 0;

        for(int i=1; i<n; i++){
            if(intervals[i][0] < endIndex){
                operations++;
            }else{
                endIndex = intervals[i][1];
            }
        }
        return operations;
    }
}

