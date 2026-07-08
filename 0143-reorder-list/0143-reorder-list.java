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
    public void reorderList(ListNode head) {
       if(head==null||head.next==null||head.next.next==null){
        return;
       }
       //finding middle
       ListNode slow=head,fast=head;
       while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode secondHead=slow.next;
       slow.next=null;
       //reverse the second ll
       ListNode curr=secondHead,prev=null;
       while(curr!=null){
        ListNode nextHead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextHead;
       }
       //insert second into first nodes in ll
       ListNode t1=head,t2=prev;
       while(t2!=null){
        ListNode m1=t1.next,m2=t2.next;
        t1.next=t2;
        t2.next=m1;
        t1=m1;
        t2=m2;
       }
    }
}