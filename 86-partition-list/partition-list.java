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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);
        ListNode lt=left;
        ListNode rt=right;
        ListNode temp=head;
        while(temp!=null){
            ListNode target=new ListNode(temp.val);
            if(temp.val<x){
                lt.next=target;
                lt=target;
            }else if(temp.val>=x){
                rt.next=target;
                rt=target;
            }
            temp=temp.next;
        }
        if(left.next==null){
            return right.next;
        }
        lt.next=right.next;
        return left.next;
    }
}