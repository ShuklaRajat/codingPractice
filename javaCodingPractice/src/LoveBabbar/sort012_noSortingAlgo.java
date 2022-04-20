package LoveBabbar;

import java.util.Scanner;

//Sort 0s, 1s and 2s without sorting algo
public class sort012_noSortingAlgo {

    public static int[] sort0s1s2s(int n, int[] input){
        int[] result = new int[n];
        int count0=0, count1=0, count2=0;

        for (int inputVal :
                input) {
            if(inputVal == 0){
                count0++;
            }
            else if(inputVal == 1){
                count1++;
            }
            else {
                count2++;
            }
        }

        int j=0;
        for (int c0 = 0; c0 < count0; c0++) {
            result[j++] = 0;
        }
        for (int c1 = 0; c1 < count1; c1++) {
            result[j++] = 1;
        }
        for (int c2 = 0; c2 < count2; c2++) {
            result[j++] = 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        for (int i: sort0s1s2s(n, input)){
            System.out.println(i);
        }

    }
}
