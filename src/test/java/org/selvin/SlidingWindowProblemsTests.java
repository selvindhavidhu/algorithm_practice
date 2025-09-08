package org.selvin;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class SlidingWindowProblemsTests {
    @Test
    public void testLengthOfLongestSubstring() {
        SoftAssertions softAssertions = new SoftAssertions();
        SlidingWindowProblems slidingWindowProblems = new SlidingWindowProblems();
        {
            String s = "abcabcbb";
            softAssertions.assertThat(slidingWindowProblems.lengthOfLongestSubstring(s)).isEqualTo(3);
        }

        {
            String s = "bbbbb";
            softAssertions.assertThat(slidingWindowProblems.lengthOfLongestSubstring(s)).isEqualTo(1);
        }

        {
            String s = "pwwkew";
            softAssertions.assertThat(slidingWindowProblems.lengthOfLongestSubstring(s)).isEqualTo(3);
        }
        softAssertions.assertAll();
    }
}
