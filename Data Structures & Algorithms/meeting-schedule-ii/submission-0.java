/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.size() == 0)
            return 0;
        Collections.sort(intervals, (a, b) -> (a.start - b.start));
        Interval prev = intervals.get(0);
        int count = 1;
        PriorityQueue<Interval> q = new PriorityQueue<>((a, b) -> (a.end - b.end));
        q.offer(prev);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            Interval p = q.poll();
            if (curr.start < p.end) {
                count++;
                q.offer(p);
            }
            q.offer(curr);
        }
        return count;
    }
}
