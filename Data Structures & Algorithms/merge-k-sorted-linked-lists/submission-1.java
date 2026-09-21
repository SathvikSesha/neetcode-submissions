/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> (a.val - b.val));
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        for (int i = 0; i < lists.length; i++) {
            if(lists[i]!=null)
                pq.offer(lists[i]);
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            temp.next = node;
            if (node.next != null)
                pq.offer(node.next);
            node.next = null;
            temp = temp.next;
        }
        return head.next;
    }
}
