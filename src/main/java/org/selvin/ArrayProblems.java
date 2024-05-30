package org.selvin;

public class ArrayProblems {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int i, j, len;
        for (i = 0, j = 0, len = nums.length; i < len; ++i) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                ++j;
            }
        }
        return j;
    }
}
