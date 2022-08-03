package LoveBabbar;


public class bestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){
        int least_so_far = Integer.MAX_VALUE;
        int highest_profit = 0;
        int profit_if_sold_today = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < least_so_far){
                least_so_far = prices[i];
            }
            profit_if_sold_today = prices[i]-least_so_far;

            if(highest_profit < profit_if_sold_today){
                highest_profit =  profit_if_sold_today;
            }
        }

        return highest_profit;
    }

    public static void main(String[] args) {
        int [] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}




//import java.util.Arrays;
//import static java.lang.Math.max;
//
//public class bestTimeToBuyAndSellStock {
//
//    public static int max_in_array(int[] arr){
//        System.out.println("sliced array: "+Arrays.toString(arr));
//        int max = arr[0];
//        for(int i=1; i<arr.length; i++){
//            int max_out_of_two = max(max, arr[i]);
//            if(max < max_out_of_two){
//                max = max_out_of_two;
//            }
//        }
//        return max;
//    }
//
//    public static int maxProfit(int[] prices) {
//        for(int day=0 ; day < prices.length; day++){
//            int max_in_subArray = max_in_array(Arrays.copyOfRange(prices, day+1, prices.length));
//            System.out.println("max_in_subArray: "+ max_in_subArray);
//            if(prices[day] < max_in_subArray){
//                return max_in_subArray - prices[day];
//            } else {
//                continue;
//            }
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        int [] prices = new int[]{7, 1, 5, 3, 6, 4};
//        System.out.println(maxProfit(prices));
//    }
//}
