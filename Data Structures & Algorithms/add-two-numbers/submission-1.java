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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int sum = 0;
        int carry = 0;
        while(l1!=null || l2!= null){
            sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
            carry = sum/10;
            sum = sum%10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry==1) temp.next = new ListNode(carry);
        return head.next;
    }
}
