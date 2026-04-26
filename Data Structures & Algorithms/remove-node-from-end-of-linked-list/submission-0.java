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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        for(int i = 0; i < n; i++) temp = temp.next;
        ListNode prev = null, curr = head;
        while(temp!=null){
            prev = curr;
            curr = curr.next;
            temp = temp.next;
        }
        if(prev == null) return head.next;
        prev.next = curr==null?null:curr.next;
        curr.next = null;
        return head;
    }
}
