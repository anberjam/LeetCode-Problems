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

        //edge case
        if(head == null) {return null;}

        //pointer
        ListNode current = head;

        //as long as there is a following node
        while (current.next != null){
            //if current node is same as next, skip duplicate and set next to following node
            if (current.val == current.next.val){
                current.next = current.next.next;
            }
            //if different, set current to next node
            else {
                current = current.next;
            }
        }
        //head returns the entire List
        return head;
    }
}