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
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        int sum = 0; int c = 0;
        while(l1!=null || l2!=null){
            sum=c+(l1==null?0:l1.val)+(l2==null?0:l2.val);
            c=sum/10;
            sum%=10;
            temp.next = new ListNode(sum);
            l1=(l1==null?l1:l1.next);
            l2=(l2==null?l2:l2.next);
            temp = temp.next;
        }
        if(c==1) temp.next = new ListNode(1);
        return head.next;
    }
}
