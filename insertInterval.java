/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        int arraySize = intervals.size();
        int start = newInterval.start;
        int end = newInterval.end;
        for (int i=0;i<arraySize;i++){
            int left = intervals.get(i).start;
            int right = intervals.get(i).end;
            
            if (left>=start && right<=end){
                continue;
            }
            else if (right<start || left>end){
                result.add(intervals.get(i));
                continue;
            } 
            else {
                if (right>=end){
                    end=right;
                }
                if (left<=start){
                    start=left;
                }
                continue;
                
            }
            
       
          
        }
        
            Interval gap = new Interval(start,end);
            result.add(gap);
            
            return result;
            
            
        }
    }
