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
        ListNode head=l1;
        ListNode prev=null;
        int c=0, sum=0;
        while(l1!= null && l2!=null){
            sum =c+ l1.val + l2.val;
            l1.val= sum%10;
            c= sum/10;
            prev=l1;
            l1=l1.next;
            l2=l2.next;
        }
        
        if(l1!= null || l2!= null){
            if(l2!=null) prev.next=l2;
            l1= prev.next;
            while(l1!= null){
            sum =c+ l1.val;
            l1.val= sum%10;
            c= sum/10;
            prev=l1;
            l1=l1.next;
            }
        }
        if(c>0) prev.next= new ListNode(c);
        return head;
        
    }
}