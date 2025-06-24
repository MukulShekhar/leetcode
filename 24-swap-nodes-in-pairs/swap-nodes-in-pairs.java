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
    public ListNode swapPairs(ListNode head) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode p=d;
        ListNode c=head;
        while(c!=null && c.next!=null){
            ListNode n=c.next;
            c.next=n.next;
            n.next=c;
            p.next=n;
            p=c;
            c=c.next;      
        }
        return d.next;
    }
}