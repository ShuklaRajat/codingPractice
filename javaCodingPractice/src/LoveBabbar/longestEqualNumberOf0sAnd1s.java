package LoveBabbar;

import java.util.HashMap;
import java.util.Map;

public class longestEqualNumberOf0sAnd1s {

    public static String findLongestBalancedSubstring(String s) {
        int sum = 0;
        Map<Integer, Integer> u_map = new HashMap<>();
        u_map.put(0, -1);

        int maxLength = 0;
        int startingIndex = 0;
        int endingIndex = 0;
        for (int i = 0; i < s.length(); i++) {

            // Find the sum considering s[i] = -1 if s[i] = 0
            if (s.charAt(i) == '0') {
                sum--;
            } else {
                sum++;
            }

            if (u_map.containsKey(sum)) {
                /*
                    Therefore, we have a subarray with zero
                    sum from the index u_map.get(sum) + 1 to the index i.
                */
                int substringLength = i - u_map.get(sum);
                if (maxLength < substringLength) {
                    maxLength = substringLength;
                    endingIndex = i;
                    startingIndex = u_map.get(sum) + 1;
                }
            } else {
                u_map.put(sum, i);
            }
        }

        if (maxLength == 0) {
            return "-1";
        } else {
            return s.substring(startingIndex, endingIndex + 1);
        }
    }

    public static void main(String[] args) {
        String s1 = "10101010";
        System.out.println(findLongestBalancedSubstring(s1));

        String s2 = "00100";
        System.out.println(findLongestBalancedSubstring(s2));

        String s3 = "1101011010";
        System.out.println(findLongestBalancedSubstring(s3));

        String s4 = "1111";
        System.out.println(findLongestBalancedSubstring(s4));
    }
}
