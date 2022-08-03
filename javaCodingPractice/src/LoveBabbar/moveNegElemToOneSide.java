package LoveBabbar;

import java.util.Scanner;

//Move all negative numbers to beginning and positive to end with constant extra space
public class moveNegElemToOneSide {

    public static int[] swap(int[] input, int j, int k){
        int temp;

        temp=input[j];
        input[j]=input[k];
        input[k]=temp;

        return input;
    }

    public static int[] moveElem(int n, int[] input){
        int j = 0;
        int k = n-1;

        for (int i = 0; i < n; i++) {
            while (input[j] < 0){
                j++;
                i++;
            }
            while (input[k] >= 0){
                k--;
                i++;
            }
            input = swap(input, j, k);
            j++;
            k--;
            i+=2;
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        input = moveElem(n, input);
        for (int i = 0; i < n; i++) {
            System.out.println(input[i]);
        }

    }
}
