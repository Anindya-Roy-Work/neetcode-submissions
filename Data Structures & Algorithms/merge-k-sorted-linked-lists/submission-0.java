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
        ListNode head = new ListNode(0);
        ListNode temp = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)-> a.val-b.val);
        for(ListNode l : lists){
            if(l!=null)
            pq.offer(l);
        } 
        while(!pq.isEmpty()){
            ListNode l = pq.poll();
            temp.next = l;
            if(l.next!=null) pq.offer(l.next);
            temp = temp.next;
        }
        return head.next;
    }
}
