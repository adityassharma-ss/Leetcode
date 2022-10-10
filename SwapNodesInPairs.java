class Solution {

    public ListNode swapPairs(ListNode head) 

    {   

        if(head==null) return head;

        

        ListNode slow = head;

        ListNode fast = head.next;

        

        while(slow.next!=null && fast.next!=null)

        {

            int temp = slow.val;

            slow.val = fast.val;

            fast.val = temp;

            

            slow=fast.next;

            fast=slow.next;

        }

        

        if(slow!=null && fast!=null)

        {

            int temp = slow.val;

            slow.val = fast.val;

            fast.val = temp;

        }

        

        return head;

    }

}


// Approach 2:

class Solution{
    public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null) return head;
    final ListNode st = head, scnd = head.next, thrd = head.next.next;// first, second and third node
    scnd.next = st;
    st.next = swapPairs(thrd);
    return scnd;
}
}
