class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> intervalsList = new ArrayList<>(Arrays.asList(intervals));
        intervalsList.add(newInterval);

        Collections.sort(intervalsList, (a,b) -> Integer.compare(a[0], b[0]));

        int[] current = intervalsList.get(0);
        List<int[]> res = new ArrayList<>();
        for(int i=1; i<intervalsList.size(); i++){
            int[] interval = intervalsList.get(i);
            if(current[1] >= interval[0]){
                current[1] = Math.max(current[1], interval[1]);
            }else{
                res.add(current);
                current = interval;
            }
        }

        res.add(current);
        return res.toArray(new int[res.size()][]);
    }

}