package org.selvin;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class ListProblemsTests {

    @Test
    public void mergeTwoListsTests() {
        ListProblems listProblems = new ListProblems();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(listProblems.mergeTwoLists(null, null)).isNull();
        ListNode list1 = ListUtil.makeList(1, 2, 4);
        ListNode list2 = ListUtil.makeList(1, 3, 4);
        softAssertions.assertThat(ListUtil.toString(listProblems.mergeTwoLists(list1, list2))).isEqualToIgnoringCase("[1, 1, 2, 3, 4, 4]");

        list1 = ListUtil.makeList(1);
        list2 = ListUtil.makeList(1, 3, 4);
        softAssertions.assertThat(ListUtil.toString(listProblems.mergeTwoLists(list1, list2))).isEqualToIgnoringCase("[1, 1, 3, 4]");

        list1 = ListUtil.makeList(1, 2, 3);
        list2 = ListUtil.makeList(1);
        softAssertions.assertThat(ListUtil.toString(listProblems.mergeTwoLists(list1, list2))).isEqualToIgnoringCase("[1, 1, 2, 3]");

        softAssertions.assertAll();
    }
}
