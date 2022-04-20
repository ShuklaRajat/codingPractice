package LoveBabbar;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int n
//                = 5;
                = 4;
        int[] arr
//                = {1,2,3,-2,5};
                = {-2,3,2,-1};

        int currMax = arr[0];
        int globalMax = arr[0];

        for(int i = 1; i<n; i++){
            System.out.println("Iteration: "+i);

            currMax = Integer.max(arr[i], currMax+arr[i]);
            System.out.println("currMax = "+currMax);

            if(currMax>globalMax){
                globalMax = currMax;
            }
            System.out.println("globalMax = "+globalMax);
            System.out.println("----------------------");
        }
        System.out.println(globalMax);

    }
}
