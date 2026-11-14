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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(right==left)
        {
            return head;
        }
        else
        {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode prev = dummy;
            for(int i=0;i<left-1;i++)
            {    
                prev = prev.next;
            }
             ListNode current = prev.next;
            for(int i=0;i<right-left;i++)
            {
             ListNode move = current.next;

             current.next = move.next;
             move.next = prev.next;
             prev.next = move;
                
            }
            return dummy.next;

        }

    }
}