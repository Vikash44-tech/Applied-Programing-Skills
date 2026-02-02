class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            // Check if there are at least k nodes left
            ListNode kth = prevGroupEnd;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) return dummy.next; // not enough nodes
            }

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;

            // Reverse this group
            ListNode prev = nextGroupStart;
            ListNode curr = groupStart;

            while (curr != nextGroupStart) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect previous group with reversed group
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }
    }
}
