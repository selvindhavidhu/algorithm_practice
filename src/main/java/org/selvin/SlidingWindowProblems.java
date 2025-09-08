package org.selvin;

import java.util.HashMap;

public class SlidingWindowProblems {
    /**
     * Given a string s, find the length of the longest substring without duplicate characters.
     * @param s input string
     * @return length of the longest substring without duplicate characters
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        int len = s.length();
        if (len == 1) {
            return 1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int right = 0;
        int answer = 0;
        for (int i = 0; i < len; ++i) {
            if (i > 0) {
                map.remove(s.charAt(i - 1));
            }

            while (right < len && !map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                ++right;
            }

            answer = Math.max(answer, right - i);
        }

        return answer;
    }
}
