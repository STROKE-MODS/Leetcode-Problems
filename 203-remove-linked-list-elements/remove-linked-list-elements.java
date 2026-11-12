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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }
        else if(head.next==null)
        {
            if(head.val==val)
            {
                return null;
            }
            else
            {
                return head;
            }
        }
        else
        {
            while(head!=null && head.val==val)
            {
                head= head.next;
            }
            ListNode temp = head;
            while(temp!=null && temp.next!=null)
            {

            if(temp.val==val)
            {
                temp = temp.next;
                head=temp;
                continue;
            }
            else if(temp.next.val==val)
            {
                if(temp.next.next==null)
                {
                    temp.next = null;
                    return head;
                    
                }
                else
                {
                    temp.next = temp.next.next;
                    continue;
                }
            }
            temp = temp.next;
            }
        }
        return head;

    }
}