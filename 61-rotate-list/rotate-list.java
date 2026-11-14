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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        else
        {
            int length=0;
        ListNode temp = head;
          while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Avoid unnecessary rotations
        k = k % length;

        for(int i=0;i<k;i++)
        {
    temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            ListNode ti = temp.next;
            ti.next = head;
            head = ti;
            temp.next = null;
        }
        return head;
        }
    }
}