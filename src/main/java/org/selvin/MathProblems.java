package org.selvin;

public class MathProblems {
    /**
     * Given two binary strings a and b, return their sum as a binary string.
     *
     * @param a the first binary string
     * @param b the second binary string
     * @return the binary string representing the sum of a and b
     */
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;

        }

        return sb.reverse().toString();
    }

    /**
     * Given a non-negative integer x, return the square root of x rounded down
     * to the nearest integer. The returned integer should be non-negative as well.
     * You must not use any built-in exponent function or operator.
     * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
     *
     * @param x the non-negative integer
     * @return the square root of x rounded down to the nearest integer
     */
    public int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
