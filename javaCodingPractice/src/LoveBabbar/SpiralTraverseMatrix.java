package LoveBabbar;
import java.io.*;
import java.util.*;

public class SpiralTraverseMatrix {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        int t = 1;
        while (t-- > 0) {
//            int r = sc.nextInt();
//            int c = sc.nextInt();
            int r=4, c=10;
//            int matrix[][] = new int[r][c];

//            for (int i = 0; i < r; i++) {
//                for (int j = 0; j < c; j++)
//                    matrix[i][j] = sc.nextInt();
//            }
//            int matrix[][] = {{1,2,3,4,5,6,7,8,9,10},
//                    {11,12,13,14,15,16,17,18,19,20},
//                    {21,22,23,24,25,26,27,28,29,30},
//                    {31,32,33,34,35,36,37,38,39,40},
//                    {41,42,43,44,45,46,47,48,49,50},
//                    {51,52,53,54,55,56,57,58,59,60},
//                    {61,62,63,64,65,66,67,68,69,70},
//                    {71,72,73,74,75,76,77,78,79,80},
//                    {81,82,83,84,85,86,87,88,89,90},
//                    {91,92,93,94,95,96,97,98,99,100}};
            int matrix[][] = {{1,2,3,4,5,6,7,8,9,10},
                    {11,12,13,14,15,16,17,18,19,20},
                    {21,22,23,24,25,26,27,28,29,30},
                    {31,32,33,34,35,36,37,38,39,40}};
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val : ans) {
                System.out.print(val + " ");
//                System.out.println();
            }
        }
    }

}

class Solution {


    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> finalAns = new ArrayList<Integer>();

        int i=0, j=0, counter=0, movement = 1, block = 0;
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
//        System.out.println(r);
//        System.out.println(c);
        while(finalAns.size() != matrix.length*matrix[0].length){
//            if(finalAns.size() == matrix.length*matrix[0].length){
//                break;
//            }
            if(matrix[i][j] != -10000){
//                System.out.println(matrix[i][j]);
                finalAns.add(matrix[i][j]);
                counter += 1;
                matrix[i][j] = -10000;
            }
            if(movement == 1){
                if(j<(c-1)+block){
                    j+=1;
                }
                else {
                    movement = -2;
                }
            }
            if(movement == -2){
                if(i<(r-1) +block){
                    i+=1;
                }
                else {
                    movement = -1;
                    block +=1;
                }
            }
            if(movement == -1){
                if(j>0){
                    j -= 1;
                }
                else {
                    movement = 2;
                }
            }
            if(movement == 2){
                if(i>0){
                    i-=1;
                }
                else {
                    movement = 1;
                    if(i<block){
                        i=block;
                    }
                }
            }
            if(counter!=0 && counter%(r+c -1) ==0 && r>0 && c>0){
                r-=1;
                c-=1;
                counter = 0;
            }
        }
    return finalAns;
    }
}
