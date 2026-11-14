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
        if(l1==null)
        {
            return l2;
        }
        else if(l2==null)
        {
            return l1;
        }
        else
        {
            int sum=0;
            int digit = 0;
            int carry = 0;
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            ListNode newList = new ListNode(0);
            ListNode temp = newList;
            while(temp1!=null || temp2!=null || carry!=0)
            {
                int value1 = (temp1!=null)?temp1.val:0;
                int value2 = (temp2!=null)?temp2.val:0;
                sum = value1+value2 + carry;
                carry = sum/10;
                digit = sum%10;
                ListNode t1 = new ListNode(digit);
                temp.next = t1;
                temp = temp.next;
                if(temp1==null && temp2==null)
                {
                    continue;
                }
                else if(temp2 == null)
                {
                    temp1 = temp1.next;
                }
                else if(temp1 ==null )
                {
                    temp2 = temp2.next;
                }
                else
                {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
          }
            return newList.next;
        }
    }
}