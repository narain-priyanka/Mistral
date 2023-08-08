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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current= head;
        ListNode previous=head;
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        current= head;
        if(length==n){
            head=head.next;
        }
        else
            for(int start=0;start<length-n;start++){
                previous=current;
                current=current.next;
            }
        previous.next=current.next;
        return head;
    }
}