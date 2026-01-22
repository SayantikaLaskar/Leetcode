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
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode prev=null;
        ListNode curr=head;
        for(int i=0; i<k; i++){
            prev=curr;
            if(curr==null) return head;
            curr=curr.next;
        }
        prev.next=null;
        ListNode rh=reverseKGroup(curr, k);
        ListNode revh=reverse(head);
        ListNode t=revh;
        while(t.next!=null){
            t=t.next;
        }
        t.next=rh;
        return revh;
    }
}