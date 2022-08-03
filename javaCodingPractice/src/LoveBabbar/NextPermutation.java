package LoveBabbar;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

/*******
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 *
 * For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally,
 * if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation
 * of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the
 * array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 *
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 * Given an array of integers nums, find the next permutation of nums.
 *
 * The replacement must be in place and use only constant extra memory.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * Example 2:
 *
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * Example 3:
 *
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */


public class NextPermutation {

//    public static int factorial(int n){
//        if (n == 0)
//            return 1;
//        else
//            return(n * factorial(n-1));
//    }
    public static boolean flag = false;

    public static void permute(int[] a, int k) {
        List<Integer> InnerPermutedArrList = new ArrayList<Integer>();
        if (k == a.length) {
            for (int i = 0; i < a.length; i++) {
                InnerPermutedArrList.add(new Integer(a[i]));
//                System.out.println(InnerPermutedArrList);
            }
            System.out.println(InnerPermutedArrList);
            if(flag){
                System.out.println(InnerPermutedArrList);
                return;
            }
            if(InnerPermutedArrList.contains(Arrays.stream(a).boxed().collect(Collectors.toList()))){
                System.out.println("Yes");
                flag = true;
            }
        } else {
            for (int i = k; i < a.length; i++) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                permute(a, k + 1);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }


    }

    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3};
//        int n = factorial(inputArr.length);
//        System.out.println(n);
//        ArrayList<ArrayList<Integer>> permutedArrList = new ArrayList<ArrayList<Integer>>();


//
//        while(n!=0){
//            System.out.println("n = "+n);
//            if(permutedArrList.contains(inputList)){
//                n=0;
//            } else {
//                n= n-1;
//            }
//            System.out.println(permutedArrList);
//            permutedArrList.add(permute(inputArr, 0));
//        }
        permute(inputArr, 0);

    }
}


























//public class NextPermutation {
////    static String permutedArr = "";
//    static int count = 0;
//    static ArrayList<ArrayList<Integer>> permutedArrList = new ArrayList<ArrayList<Integer>>();
//
//    static void permute(int[] a, int k) {
//        if (k == a.length) {
////            String stringArr;
////            stringArr = "[";
//            ArrayList<Integer> InnerPermutedArrList = new ArrayList<Integer>();
//
//            for (int i = 0; i < a.length; i++) {
//                InnerPermutedArrList.add(new Integer(a[i]));
////                stringArr = stringArr + a[i];
////                if (i != a.length - 1) {
////                    stringArr = stringArr + ",";
////                }
//            }
////            stringArr = stringArr + "]";
////            permutedArr = permutedArr + stringArr + ",";
////            count = count + 1;
//            permutedArrList.add(InnerPermutedArrList);
//        } else {
//            for (int i = k; i < a.length; i++) {
//                int temp = a[k];
//                a[k] = a[i];
//                a[i] = temp;
//
//                permute(a, k + 1);
//
//                temp = a[k];
//                a[k] = a[i];
//                a[i] = temp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] inputArr = {1, 2, 3};
//        ArrayList<Integer> input = new ArrayList<>();
//        Collections.addAll(input, inputArr);
//
//        System.out.println("\nThe permuted sequences are: ");
//        permute(inputArr, 0);
//
//        System.out.println(permutedArrList.get(0).getClass());
//
//        ArrayList<Integer> inputArrList = new ArrayList<Integer>();
//        for(ArrayList arr: permutedArrList){
//            if(arr == )
//        }
//
//
//
////        permutedArr = permutedArr.substring(0, permutedArr.length() - 1);
////
////        System.out.println(permutedArr);
////        ArrayList<String> finalArr = new ArrayList<String>(
////                Arrays.asList(permutedArr));
////
////        System.out.println(permutedArr.getClass());
//
//    }
//}
//























