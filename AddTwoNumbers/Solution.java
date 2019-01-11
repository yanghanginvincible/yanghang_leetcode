/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int overflow=0;
        ListNode a=l1 , b=l2 , temp=l3;
        while(a!=null || b!=null){
            int x = (a!=null) ? a.val:0;
            int y = (b!=null) ? b.val:0;
            int sum = x + y + overflow;
            temp.next =new ListNode(sum%10);
            temp = temp.next;
            overflow = sum/10;
            if (a!=null) a = a.next;
            if (b!=null) b = b.next;          
        }
        if (overflow>0){
            temp.next = new ListNode(overflow);
        }
        return l3.next;
    }
}