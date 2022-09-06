/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode slow = headA;
        ListNode fast = headB;
        while(slow != fast){
            slow = slow == null ? headB : slow.next;
            fast = fast == null ? headA : fast.next;
        }
        return slow;
    }
}
