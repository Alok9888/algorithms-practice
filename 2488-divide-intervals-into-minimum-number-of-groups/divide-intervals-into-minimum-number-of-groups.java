class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> (a[0])));
        minHeap.offer(intervals[0][1]);
        for(int i=1; i<n; i++){
            if(!minHeap.isEmpty() && minHeap.peek() < intervals[i][0]){
                int topOfMinHeap = minHeap.poll();
                minHeap.offer(intervals[i][1]);
            }else{
                minHeap.offer(intervals[i][1]);
            }
        }
        return minHeap.size();
    }
}