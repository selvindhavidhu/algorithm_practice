package org.selvin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListUtil {
    public static ListNode makeList(int... values) {
        Objects.requireNonNull(values);

        ListNode list = new ListNode(0);
        ListNode p = new ListNode(0);

        int i = 0;
        for (int val : values) {
            ListNode newNode = new ListNode(val);
            if (i == 0) {
                p = list = newNode;
                ++i;
            } else {
                p.next = newNode;
                p = p.next;
            }
        }

        return list;
    }

    public static String toString(ListNode node) {
        StringBuilder builder = new StringBuilder("[");
        ListNode p = node;
        boolean wroteFirstNode = false;
        while (p != null) {
            if (!wroteFirstNode) {
                builder.append(p.val);
                wroteFirstNode = true;
            } else {
                builder.append(", ");
                builder.append(p.val);
            }
            p = p.next;
        }
        builder.append("]");

        return builder.toString();
    }

    public static List<Integer> toArrayList(ListNode node) {
        Objects.requireNonNull(node);

        ArrayList<Integer> list = new ArrayList<>();
        ListNode p = node;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }

        return list;
    }
}
