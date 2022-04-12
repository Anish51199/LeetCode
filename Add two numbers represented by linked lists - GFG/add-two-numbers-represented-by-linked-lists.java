// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    
    static Node rev(Node head){
        Node curr=head, prev=null, next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        first=rev(first);
        second=rev(second);
        
        
        int sum=0;
        int carry=0;
        Node prev=null,head=first;
        
        while(first!=null && second!=null){
            sum=first.data+second.data+carry;
            first.data=sum%10;
            carry=sum/10;
            prev=first;
            first=first.next;
            second=second.next;
        }
        
        if(first!=null || second!=null){
            if(second!=null)  prev.next=second;
            first=prev.next;
            
            while(first!=null){
            sum=first.data+carry;
            first.data=sum%10;
            carry=sum/10;
            prev=first;
            first=first.next;
            }
        }
        if(carry>0) prev.next= new Node(carry);
        head=rev(head);
        return head;
    }
}