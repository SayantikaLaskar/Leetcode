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
    public int pairSum(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        int m=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode n, p=null;
        while(s!=null){
            n=s.next;
            s.next=p;
            p=s;
            s=n;
        }
        while(p!=null){
            m=Math.max(m, head.val+p.val);
            p=p.next;
            head=head.next;
        }
        return m;
    }
}