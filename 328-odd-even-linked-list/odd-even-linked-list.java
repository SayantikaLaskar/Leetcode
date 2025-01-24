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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode lo=head;
        ListNode c=head.next;
        while(c!=null && c.next!=null){
            ListNode o=c.next;
            c.next=c.next.next;
            o.next=lo.next;
            lo.next=o;
            lo=o;
            c=c.next;
        }
        return head;
    }
}