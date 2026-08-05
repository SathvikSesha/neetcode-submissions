class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int max = 0;
        for (int i = 0; i < intervals.size(); i++) {
            max = Math.max(max, intervals.get(i).end);
        }
        int arr[] = new int[max + 1];
        for (int i = 0; i < intervals.size(); i++) {
            arr[intervals.get(i).start]++;
            arr[intervals.get(i).end]--;
        }
        int maxCount = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count+=arr[i];
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
