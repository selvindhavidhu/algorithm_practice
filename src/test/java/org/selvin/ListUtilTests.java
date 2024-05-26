package org.selvin;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import java.util.List;

public class ListUtilTests {
    @Test
    public void testToString() {
        SoftAssertions softAssertions = new SoftAssertions();

        ListNode list = ListUtil.makeList(1, 2, 3, 4);
        softAssertions.assertThat(ListUtil.toString(list)).isEqualToIgnoringCase("[1, 2, 3, 4]");
        softAssertions.assertThat(ListUtil.toString(null)).isEqualToIgnoringCase("[]");

        list = ListUtil.makeList(1);
        softAssertions.assertThat(ListUtil.toString(list)).isEqualToIgnoringCase("[1]");

        softAssertions.assertAll();
    }

    @Test
    public void testToArrayList() {
        SoftAssertions softAssertions = new SoftAssertions();

        ListNode list = ListUtil.makeList(1, 2, 3, 4);
        softAssertions.assertThat(ListUtil.toArrayList(list)).containsAll(List.of(1, 2, 3, 4));
        list = ListUtil.makeList(1);
        softAssertions.assertThat(ListUtil.toArrayList(list)).containsAll(List.of(1));

        softAssertions.assertAll();
    }
}
