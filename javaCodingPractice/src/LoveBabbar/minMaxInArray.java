package LoveBabbar;

import java.util.Scanner;

public class minMaxInArray {

    public static int[] assignMinMax(int minIndex, int maxIndex, int[] arr){
        int min = arr[minIndex];
        int max = arr[maxIndex];
        int[] assignmentArr = {min, max};

        return assignmentArr;
    }

    public static int[] minMax(int[] arr){
        int[] result = assignMinMax(0,0,arr);
        int min = result[0];
        int max = result[1];

        if (arr.length == 2){
            if (arr[0] == arr[1]){
                return assignMinMax(0, 0, arr);
            }
            else if(arr[0] < arr[1]){
                return assignMinMax(0, 1, arr);
            }
            else{
                return assignMinMax(1, 0, arr);
            }
        }
        else {
            int indexOfMin = 0, indexOfMax = 0;

            for (int i = 1; i < arr.length-1; i++) {
                if(arr[i] < min){
                    min = arr[i];
                    indexOfMin = i;
                }
                if(arr[i] > max){
                    max = arr[i];
                    indexOfMax = i;
                }
            }
            return assignMinMax(indexOfMin, indexOfMax, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input =
                {11,6,10,7,13,10,13,6};
//                {1,2,3,5,7,4};
        System.out.println(minMax(input)[0]+"\n"+minMax(input)[1]);
    }
}
