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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(!pq.isEmpty()){
            ListNode min=pq.poll();
            cur.next=min;
            if(min.next!=null){
                pq.add(min.next);   
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}