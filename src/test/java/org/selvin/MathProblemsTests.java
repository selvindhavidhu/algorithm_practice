package org.selvin;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class MathProblemsTests {
    @Test
    public void testAddBinary() {
        SoftAssertions softAssertions = new SoftAssertions();
        MathProblems mathProblems = new MathProblems();

        String a = "11";
        String b = "1";
        softAssertions.assertThat(mathProblems.addBinary(a, b)).isEqualTo("100");

        a = "1010";
        b = "1011";
        softAssertions.assertThat(mathProblems.addBinary(a, b)).isEqualTo("10101");

        softAssertions.assertAll();
    }

    @Test
    public void testMySqrt() {
        SoftAssertions softAssertions = new SoftAssertions();
        MathProblems mathProblems = new MathProblems();

        int x = 0;
        softAssertions.assertThat(mathProblems.mySqrt(x)).isEqualTo(0);

        x = 1;
        softAssertions.assertThat(mathProblems.mySqrt(x)).isEqualTo(1);

        x = 4;
        softAssertions.assertThat(mathProblems.mySqrt(x)).isEqualTo(2);

        x = 8;
        softAssertions.assertThat(mathProblems.mySqrt(x)).isEqualTo(2);

        x = 2147395599;
        softAssertions.assertThat(mathProblems.mySqrt(x)).isEqualTo(46339);

        softAssertions.assertAll();
    }
}
