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
            return null;
        }
        if(head.next==null)
        {
            if(head.val==val)
            {
                return head.next;
            }
            else
            {
                return head;
            }
        }
        else
        {
            ListNode temp = head;
            while(temp.next!=null)
            {
                if(temp.val==val)
                {

                    head = head.next;
                    temp = temp.next;
                    continue;
                }
                if(temp.next.val==val)
                {
                    if(temp.next.next==null)
                    {
                        temp.next =  null;
                        continue;
                    }
                    temp.next = temp.next.next;
                    continue;
                }
                temp = temp.next;
                
            }
            if(temp.val==val)
            {
                return head.next;
            }
            return head;
        }
    }
}