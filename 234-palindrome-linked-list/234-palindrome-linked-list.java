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

        ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur!=null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;

    }
    public boolean isPalindrome(ListNode A) {
        ListNode tmp = A;
        ListNode sp = A;
        ListNode fp = A.next;
        while(fp!=null && fp.next!=null)
        {
            sp = sp.next;
            fp = fp.next.next;
        }
        ListNode mid = reverse(sp.next);
        sp.next = mid;
        ListNode p1 = A;
        ListNode p2 = mid;
        while(p2!=null)
        {
            if(p1.val!=p2.val)
                return false;
            p1=p1.next;
            p2=p2.next;
        }
        
        return true;
    }
}