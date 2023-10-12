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
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode dummynode = new ListNode(0);
//         ListNode current = dummynode;

//         while(list1 != null && list2 != null){
//             if(list1.val < list2.val){
//                 current.next = new ListNode(list1.val);
//                 current= current.next;
//                 list1=list1.next;
//             }
//             else{
//                 current.next = new ListNode(list2.val);
//                 current= current.next;
//                 list2=list2.next;
//             } 

//             if(list1 !=null){
//                 current.next=list1;
//             }
//             else{
//                 current.next=list2;
//             }
//         }
//         return dummynode.next;
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                current = current.next;
                list2 = list2.next;
            }
        }

        // Append the remaining nodes (if any) from list1 or list2
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummyNode.next;
    }
}
