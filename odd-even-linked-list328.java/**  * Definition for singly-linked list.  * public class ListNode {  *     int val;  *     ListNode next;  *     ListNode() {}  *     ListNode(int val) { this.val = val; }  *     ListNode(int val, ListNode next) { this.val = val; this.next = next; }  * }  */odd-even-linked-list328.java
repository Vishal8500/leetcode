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
        if(head==null || head.next==null){
            return head;
        }
        ListNode oddhead=head;
        ListNode oddtail=head;
        ListNode evenhead=head.next;
        ListNode eventail=head.next;
        int index=3;

        ListNode current=evenhead.next;
        while(current!=null){
            if(index%2==1){
                oddtail.next=current;
                oddtail=oddtail.next;
            }else{
                eventail.next=current;
                eventail=eventail.next;
            }
            current=current.next;
            index++;
        }
        oddtail.next=evenhead;
        eventail.next=null;
        return oddhead;
    }
}
