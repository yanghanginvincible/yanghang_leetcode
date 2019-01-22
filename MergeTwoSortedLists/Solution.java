/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int x=0;
        ListNode temp = new ListNode(0);
        ListNode a=l1,b=l2,c=temp;
        while(a!=null && b!=null){
        //    x=(a.val<=b.val)?(a.val):(b.val);
        //    c.next = new ListNode(x);
        //    c = c.next;
            if(a.val<=b.val){
                x = a.val;
                c.next = new ListNode(x);
                c = c.next;
                a = a.next;
            }else{
                x = b.val;
                c.next = new ListNode(x);
                c = c.next;
                b = b.next;
            }
        }
        
        while(a!=null){
            x = a.val;
            c.next = new ListNode(x);
            c = c.next;
            a = a.next;
        }
        while(b!=null){
            x = b.val;
            c.next = new ListNode(x);
            c = c.next;
            b = b.next;
        }
        return temp.next;
    }
}