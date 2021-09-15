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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode(0);
        ListNode alter = answer;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry =0;
        
        
        while (temp1 != null || temp2 != null) {
            int x = (temp1 != null) ? temp1.val : 0;
            int y = (temp2 != null) ? temp2.val : 0;
            
            
            int sum = x+y+carry;
            
            carry = sum/10;
            
            alter.next = new ListNode(sum%10);
            alter = alter.next;
            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
            
            if (carry >0) {
                alter.next = new ListNode(carry);
            }
            
            
 
            
        }
        
        return answer.next;
        
    }
       


        
    }
    
//     public int add (int x, int y){
//         return x+y;
//     }
    
//     public int list_to_int (ListNode node){
//         int index = 0;
//         int result =0;
//         ListNode temp = node;
        
//         while (node != null) {
//             result += (temp.val*Math.pow(10,index));
//             temp = temp.next;
//             index++;
//         }    
        
//         return result;
        
//     }
    
    
//     public ListNode returnReverse (ListNode node) {
//         ListNode previous = null;
//         ListNode after = node.next;
//         ListNode temp = node;
        
        
//         while (temp != null) {
//             after = temp.next;
//             temp.next=previous;
//             previous = temp;
//             temp = after; 
//         }
        
//         return previous;
        
//     }
    
    
