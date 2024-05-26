package org.selvin;

public class ListProblems {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if (list2 == null) {
            return list1;
        }

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
}
