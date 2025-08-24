package org.selvin;

import javax.annotation.Nullable;
import java.util.Objects;

public class ListProblems {
    public @Nullable ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result = new ListNode(0);
        ListNode p = result;
        ListNode p2 = list1;
        ListNode p3 = list2;

        while ((p2 != null) && (p3 != null)) {
            if (p2.val <= p3.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p3;
                p3 = p3.next;
            }
            p = p.next;
        }

        p.next = p2 == null ? p3 : p2;
        return result.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Objects.requireNonNull(l1);
        Objects.requireNonNull(l2);

        ListNode result = new ListNode(0);

        ListNode l1p = l1;
        ListNode l2p = l2;
        ListNode resultp = result;

        int carry = 0;
        while ((l1p != null) || (l2p != null) || (carry != 0)) {
            int val1 = l1p != null ? l1p.val : 0;
            int val2 = l2p != null ? l2p.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            ListNode newNode = new ListNode(sum % 10);
            resultp.next = newNode;
            resultp = newNode;

            if (l1p != null) l1p = l1p.next;
            if (l2p != null) l2p = l2p.next;

        }

        return result.next;
    }
}
