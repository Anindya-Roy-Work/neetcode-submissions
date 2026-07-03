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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l : lists){
            if(l!=null) pq.offer(l);
        }
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(!pq.isEmpty()){
            ListNode t = pq.poll();
            temp.next = t;
            temp = temp.next;
            if(t.next!=null) pq.offer(t.next);
        }
        return head.next;
    }
}
