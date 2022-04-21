package LoveBabbar;

public class mergeIntervals {

    public static int[][] removeElement(int[][] intervals, int index){
        for (int i = index; i<intervals.length; i++){
            intervals[index] = intervals[index+1];
        }
        System.out.println("After removing : ");
        for(int i=0; i<intervals.length; i++){
            System.out.println(intervals[i][0] + " , " + intervals[i][1]);
        }
        System.out.println("-----------------------");
        return intervals;
    }

    public static int[][] merge(int[][] intervals) {

        for(int i=0; i<intervals.length-1; i++){
            System.out.println("i:"+i+"\nintervals[][]="+intervals);
            if(intervals[i][1] > intervals[i+1][0]){
                System.out.println("Merging "+ intervals[i] + " and "+ intervals[i+1] );
                intervals[i] = new int[]{intervals[i][0], intervals[i + 1][1]};
                intervals = removeElement(intervals, i+1);
                System.out.println("Merged intervals = "+intervals);
//                i--;
            }
        }

        return intervals;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        intervals = merge(intervals);

        for(int i=0; i<intervals.length; i++){
            System.out.println(intervals[i][0] + " , " + intervals[i][1]);
        }
    }
}
