package org.selvin;

import java.util.Arrays;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class ArrayProblemsTest {
    @Test
    public void testRemoveElement() {
        int[] nums = {3};
        int val = 2;
        int[] expectedNums = {3};

        ArrayProblems arrayProblems = new ArrayProblems();
        int k = arrayProblems.removeElement(nums, val);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(k).isEqualTo(expectedNums.length);
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; ++i) {
            softAssertions.assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }

        softAssertions.assertAll();
    }
}
