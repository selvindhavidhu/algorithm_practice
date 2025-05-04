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
}
