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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode left=head;
        ListNode right=head.next;
        while(right!=null){
            if(left.val==right.val){
                right=right.next;
                continue;
            }
            left.next=right;
            left=right;
            right=right.next;
        }
        left.next=null;
        return head;
    }
}
