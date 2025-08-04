/*
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question3 {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int st = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= st) {
                st = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, i - st + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(Question3.lengthOfLongestSubstring(s));

    }
}
