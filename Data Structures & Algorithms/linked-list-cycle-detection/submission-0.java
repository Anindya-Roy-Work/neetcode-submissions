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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode a = head; ListNode b = head;
        while(b!= null && b.next!= null){
            a = a.next;
            if(b.next != null) b = b.next.next;
            if(a==b) return true;
        }
        return false;
    }
}
