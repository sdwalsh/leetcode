package io.mirango;

public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // if a list is empty, just return the other list
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        // create a dummy starter node - will be removed when method returns
        ListNode start = new ListNode(0);
        ListNode c = start;
        int carry = 0;
        int combined;
        int v1;
        int v2;
        // break as soon as a list is zero and carry is 0 (if a list remains just tack on)
        while(l1 != null || l2 != null || carry == 1) {
            // null checks
            if (l1 == null) {
                v1 = 0;
            } else {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                v2 = 0;
            } else {
                v2 = l2.val;
                l2 = l2.next;
            }
            combined = v1 + v2 + carry;
            c.next = new ListNode(combined % 10);
            c = c.next;

            if (combined > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
        }

        // Speed up by tacking on rather than continuing to loop
        if(l1 != null) {
            c.next = l1;
        }
        if(l2 != null) {
            c.next = l2;
        }
        return start.next;
    }
}
