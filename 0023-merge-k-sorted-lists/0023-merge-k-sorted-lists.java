class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min-Heap based on node value
        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!minHeap.isEmpty()) {
            // Get smallest node
            ListNode smallest = minHeap.poll();
            curr.next = smallest;
            curr = curr.next;

            // If this node has next, add it to heap
            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;
    }
}
