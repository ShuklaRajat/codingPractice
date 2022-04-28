package LoveBabbar;

import java.util.Arrays;
import java.util.LinkedList;

public class mergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(interval[1], merged.getLast()[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }


    public static void main(String[] args) {
        int[][] intervals
//                = {{1,3},{2,6},{8,10},{15,18}};
                        ={{1,4},{0,0}};
        intervals = merge(intervals);

        for(int i=0; i<intervals.length; i++){
            System.out.println(intervals[i][0] + " , " + intervals[i][1]);
        }
    }
}
