/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if(headA == NULL || headB == NULL){
            return NULL;
        }
        ListNode* slow = headA;
        ListNode* fast = headB;
        while(slow != fast){
            slow = slow == NULL ? headB : slow->next;
            fast = fast == NULL ? headA : fast->next;
        }
        return slow;
    }
};
