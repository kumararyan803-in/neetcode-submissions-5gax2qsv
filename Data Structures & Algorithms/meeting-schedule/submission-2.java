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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals==null || intervals.isEmpty()){
            return true;
        }
        Collections.sort(intervals,(a,b)->a.start-b.start);
        Interval occ=intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<occ.end){
                return false;
            }
            occ.end=intervals.get(i).end;
        }
        return true;
    }
}
