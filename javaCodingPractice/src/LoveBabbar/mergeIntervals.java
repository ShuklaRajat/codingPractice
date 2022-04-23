package LoveBabbar;

public class mergeIntervals {
    public static int[][] removeElement(int[][] intervals, int index){
        int[][] removedElementArr = new int[intervals.length-1][2];

        for(int i=0, k=0; i< intervals.length; i++){
            if(i==index){
                continue;
            } else {
                removedElementArr[k] = intervals[i];
                k++;
            }
        }

        return removedElementArr;
    }

    public static int[][] sortArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp[];
                if (arr[i][0] > arr[j][0]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public static int[][] merge(int[][] intervals) {

        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1] >= intervals[i+1][0]){
                if(intervals[i][0] < intervals[i+1][0]){
                    if(intervals[i][1] < intervals[i+1][1]){
                        intervals[i] = new int[]{intervals[i][0], intervals[i + 1][1]};
                    } else {
                        intervals[i] = new int[]{intervals[i][0], intervals[i][1]};
                    }
                }
                else {
                    if(intervals[i][1] < intervals[i+1][1]){
                        intervals[i] = new int[]{intervals[i+1][0], intervals[i + 1][1]};
                    } else {
                        intervals[i] = new int[]{intervals[i+1][0], intervals[i][1]};
                    }
                }

                intervals = removeElement(intervals, i+1);
            }
        }

        return intervals;
    }


    public static void main(String[] args) {
        int[][] intervals
//                = {{1,3},{2,6},{8,10},{15,18}};
                        ={{1,4},{0,0}};
        intervals = merge(sortArr(intervals));

        for(int i=0; i<intervals.length; i++){
            System.out.println(intervals[i][0] + " , " + intervals[i][1]);
        }
    }
}
