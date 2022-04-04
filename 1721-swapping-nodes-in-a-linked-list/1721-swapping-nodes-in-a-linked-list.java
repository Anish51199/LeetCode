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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left=head;
        ListNode right=head;
        int count=0;
        
        while(left!=null){
            count++;
            if(count==k) break;

            left=left.next;
        }
        ListNode tempNode=left;
        
        while(tempNode.next!= null){
            tempNode=tempNode.next;
            right=right.next;
        }
        
        int temp=right.val;
        right.val=left.val;
        left.val=temp;
        
        return head;
        
    }
}