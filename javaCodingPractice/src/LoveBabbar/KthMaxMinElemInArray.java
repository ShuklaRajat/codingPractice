package LoveBabbar;

import javafx.collections.transformation.SortedList;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;

public class KthMaxMinElemInArray {

    public static int KthMaxMinElemInArrayLogic(int[] input, int k){
        Arrays.sort(input);
        System.out.print("Sorted array: ");
        for (int i = 0; i < input.length; i++)
        {
            System.out.print(input[i]+", ");
        }
        System.out.println();
        return input[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input =
                {11,6,10,7,13,10,13,6};
        int k = sc.nextInt();
        System.out.println("\n"+KthMaxMinElemInArrayLogic(input, k));
    }
}
