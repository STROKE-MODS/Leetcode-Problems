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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        if(temp==null || temp.next==null)
        {
            return head;
        }
        else
        {
            int count = 0;
            while(temp!=null)
            {
                count++;
                temp = temp.next;
            }
            temp = head;
            int second_count = 0;
            for(int i=0;i<count/2;i++)
            {
                temp = temp.next;
            }
            return temp;
        }
    }
}