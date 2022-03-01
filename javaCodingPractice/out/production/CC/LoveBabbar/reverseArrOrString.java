package LoveBabbar;

import java.util.Scanner;

public class reverseArrOrString {
    public static int[] reverse(int[] arr){
        for(int i=0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] input = new int[k];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        int[] result = reverse(input);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
}
