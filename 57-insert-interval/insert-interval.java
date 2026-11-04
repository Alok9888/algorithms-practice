class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        List<int[]> res = new ArrayList<>();
        while(i<n && newInterval[0] > intervals[i][1]){
            res.add(intervals[i]);
            i++;
        }

        if(i<n){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        }

        int j = i;
        while(j<n && newInterval[1] >= intervals[j][0]){
            newInterval[1] = Math.max(newInterval[1], intervals[j][1]);
            j++;
        }

        res.add(newInterval);

        while(j<n){
            res.add(intervals[j]);
            j++;
        }

        return res.toArray(new int[res.size()][]);
    }
}