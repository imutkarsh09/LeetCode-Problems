import java.util.*;
class Prob_56 {
    public class Pair implements Comparable<Pair>
    {
        int st;
        int et;
        Pair(int st, int et)
        {
            this.st = st;
            this.et = et;
        }
        public int compareTo(Pair other)
        {
            if(this.st!=other.st)
            {
                return (this.st - other.st); 
            }
            else
            {
                return (this.et - other.et);
            }
        }
        
    }
    public int[][] merge(int[][] intervals) {
        
        Pair[] pairs = new Pair[intervals.length];
        for(int i=0;i<intervals.length;i++)
        {
            pairs[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(pairs);
        List<int[]> ans = new ArrayList<>();
        int curr_sta = pairs[0].st;
        int curr_end = pairs[0].et;
        for(int i=0;i<pairs.length;i++)
        {
            int sta_here = pairs[i].st;
            int end_here = pairs[i].et;
            if(sta_here<=curr_end)
            {
                curr_end = Math.max(curr_end, end_here);
            }
            else {
                ans.add(new int[]{curr_sta,curr_end});
                curr_sta = sta_here;
                curr_end = end_here;
            }
        }
        ans.add(new int[]{curr_sta,curr_end});
        return ans.toArray(new int[0][]);
    }
}