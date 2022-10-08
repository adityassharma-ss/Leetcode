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

// Approach 1: Split Linked List, Find Mid, Reverse Second Part, Then Reorder
// TC: O(n) || SC: O(1)
class Solution {
    public ListNode midNode(ListNode head){
        ListNode fast =  head, slow  =  head;
        while(fast.next!=null && fast.next.next!=null){
            fast =  fast.next.next;
            slow =  slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    }

    
    public void reorderList(ListNode head) {
        
        ListNode midNode =  midNode(head);
        ListNode nextToMid =  midNode.next;
        midNode.next = null;
        ListNode p2 =  reverse(nextToMid);
        
        ListNode p1 =  head ,p1Next;    
        while(p1!=null && p2!=null){
            p1Next =  p1.next;                                    
			p1.next =  p2;
			           
            p1 =  p2;
            p2=p1Next;                        
        }                
    }            
}

// Approach 2: Single Traversal Approch || TC O(N) , SC O(n)

class Solution {
    public void reorderList(ListNode head) {
        ListNode [] left =  new ListNode[1];// it will create in heap
        left[0]  =  head;
        reorder(left,head);
        
    }
    
    // left pointer will be created in heap and right pointer will be created in stack
     public void reorder(ListNode left[],ListNode right){
        if(right==null){
            return ;
        }
        reorder(left,right.next);
        
    // in post area of recursion right pointer coming back(because of function remove from recursion stack)
   // and we move left pointer forward 
        if(left[0].next!=null){
            ListNode leftNext =  left[0].next;
            left[0].next =  right;
            right.next =  leftNext;
            left[0] =  leftNext;            
        }
        
    // as we need to  merge till left pointer behind the right pointer 
        if(left[0].next == right){
            left[0].next =  null;
        }                        
    }
}
