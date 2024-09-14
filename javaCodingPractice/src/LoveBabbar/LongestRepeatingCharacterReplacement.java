// https://leetcode.com/problems/longest-repeating-character-replacement/description/
class Solution {
    public int characterReplacement(String s, int k) {
        int maxf = 0; // Maximum frequency of any character in the current window
        int[] charFreq = new int[26];
        int left = 0;
        int maxLengthSubstr = 0; // This tracks the longest valid window (or we can say the max length of substring)

        for(int right = 0 ; right < s.length() ; right++) {
            int currCharFreq = ++charFreq[s.charAt(right) - 'A'];
            maxf = currCharFreq > maxf ? currCharFreq : maxf;

            int windowSize = right - left + 1;
            while(windowSize - maxf > k) { // If the number of replacements needed in current window is more than 'k', shrink the window
                charFreq[s.charAt(left) - 'A']--; //Since we're shrinking window from LHS we remove the freq of left pointed character by one and then shrink the window
                left++; // shrinking the window
                windowSize = right - left + 1; //updated window size
            }
            maxLengthSubstr = maxLengthSubstr > windowSize ? maxLengthSubstr : windowSize; //updating longest valid window
        }
      
        return maxLengthSubstr;
    }
}
