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
}
