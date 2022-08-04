package LoveBabbar;

import java.util.ArrayList;

public class rearrangeArray {

    public static ArrayList<Integer> alternateIntegerArray(int[] arr){
        ArrayList<Integer> result = new ArrayList<Integer>();

        ArrayList<Integer> ltz = new ArrayList<Integer>();
        ArrayList<Integer> mtz = new ArrayList<Integer>();

        ArrayList<Integer> siw = new ArrayList<Integer>();
        ArrayList<Integer> oa = new ArrayList<Integer>();

        int siw_length;

        for(int i=0; i< arr.length; i++){
            if(arr[i]<0){
                ltz.add(arr[i]);
            } else {
                mtz.add(arr[i]);
            }
        }

        if(ltz.size() > mtz.size()) {
            siw = mtz;
            oa = ltz;

            siw_length = mtz.size()+1;
        } else {
            siw = ltz;
            oa = mtz;

            siw_length = ltz.size()+1;
        }

//        System.out.println(siw);
//        System.out.println(oa);

        int flag = 0;
        int j=0;
        int k=0;

        for(int i=0; i< arr.length; i++){
            if(flag == 0 && siw_length-1 > 0){
                    result.add(siw.get(j));
                    j=j+1;
                    siw_length = siw_length-1;
                    flag = 1;
            } else {
                result.add(oa.get(k));
                k=k+1;

                if(siw_length-1 > 0){
                    flag = 0;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println(alternateIntegerArray(arr));
    }
}
