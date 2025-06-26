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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head!=null && head.val == val) head = head.next;
        ListNode ms = head;
        while(ms!=null && ms.next !=null) {
            if(ms.next.val == val) {
                ms.next = ms.next.next;
            }else{
                ms = ms.next;
            }
        }
        return head;
    }
}