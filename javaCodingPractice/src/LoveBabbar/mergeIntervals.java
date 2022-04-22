package LoveBabbar;

public class mergeIntervals {

//    public static int[][] removeElement(int[][] intervals, int index){
////        int i;
////        for (i = index; i<intervals.length-index; i++){
////            intervals[i] = intervals[i+1];
////        }
////        intervals[i] = null;
//
////        System.out.println("-----------------------");
////        return intervals;
////
//        int[][] removedElementArr = new int[intervals.length-1][2];
//
//        for(int i=0, k=0; i< intervals.length; i++){
//           if(i==index){
//               continue;
//           } else {
//               removedElementArr[k] = intervals[i];
//               k++;
//           }
//        }
//
//        System.out.println("After removing : ");
//        for(int i=0; i<removedElementArr.length; i++){
//            System.out.println(removedElementArr[i][0] + " , " + removedElementArr[i][1]);
//        }
//        System.out.println("-------------------------------");
//
//        return removedElementArr;
//    }
//public static int[][] merge(int[][] intervals) {
//
//    for(int i=0; i<intervals.length-1; i++){
//        System.out.println("i:"+i+"\nintervals[][]="+intervals);
//        if(intervals[i][1] > intervals[i+1][0]){
//            System.out.println("Merging "+ intervals[i] + " and "+ intervals[i+1] );
//            intervals[i] = new int[]{intervals[i][0], intervals[i + 1][1]};
//            intervals = removeElement(intervals, i+1);
//            System.out.println("Merged intervals = "+intervals);
////                i--;
//        }
//    }
//
//    return intervals;
//}


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
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        intervals = merge(intervals);

        for(int i=0; i<intervals.length; i++){
            System.out.println(intervals[i][0] + " , " + intervals[i][1]);
        }
    }
}
