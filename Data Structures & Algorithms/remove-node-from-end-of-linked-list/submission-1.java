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
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode l = prev;
        while(n>0){
            temp = temp.next;
            n--;
        }
        while(temp!=null){
            temp = temp.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return l.next; 
    }
}
