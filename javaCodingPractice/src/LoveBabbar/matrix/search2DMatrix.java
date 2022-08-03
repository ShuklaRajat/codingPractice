//package LoveBabbar.matrix;
//
//public class search2DMatrix {
//    public static void main(String[] args) {
//
//    }
//
//}
//
//class Solution {
//    int binarySearch(int arr[], int l, int r, int x)
//    {
//        if (r >= l) {
//            int mid = l + (r - l) / 2;
//
//            // If the element is present at the
//            // middle itself
//            if (arr[mid] == x)
//                return mid;
//
//            // If element is smaller than mid, then
//            // it can only be present in left subarray
//            if (arr[mid] > x)
//                return binarySearch(arr, l, mid - 1, x);
//
//            // Else the element can only be present
//            // in right subarray
//            return binarySearch(arr, mid + 1, r, x);
//        }
//
//        // We reach here when element is not present
//        // in array
//        return -1;
//    }
//
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1]){
//            return false;
//        }
//
//        for(int i=0; i<matrix.length; i++){
//            if(target>matrix[i][matrix[0].length-1]){
//                continue;
//            } else {
//                if(binarySearch(matrix[i], 0, matrix[0].length-1, target) == -1){
//                    return false;
//                } else {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}