package hackerRank;

//import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargestSubstring {

//USING ARRAYS
//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = new String();
//        String largest  = new String();
//        String[] subArrays = new String[s.length()-(k-1)];
//
//        for(int i = 0;i<s.length()-(k-1);i++){
//            subArrays[i] = s.substring(i,i+k);
//        }
//
//        Arrays.sort(subArrays);
//
//        smallest = subArrays[0];
//        largest = subArrays[subArrays.length-1];
//
//        return smallest+"\n"+largest;
//    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";

        for(int i =0 ; i<s.length()-k+1; i++){
            String substring_ = s.substring(i, i + k);
            if(substring_.compareTo(smallest) < 0){
                smallest = substring_;
            }
            if(substring_.compareTo(largest) > 0){
                largest = substring_;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int k = sc.nextInt();

        System.out.println(getSmallestAndLargest(inputString, k));

    }
}
