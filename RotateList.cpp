/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(head == NULL && head->next == NULL){
            return head;
        }
        
        ListNode* ans = new ListNode(0);
        ans->next = head;
        ListNode* fast = ans;
        ListNode* slow = ans;
        
        int i;
        for(i=0;fast->next!=NULL;i++){
            fast = fast->next;
        }
        
        for(int j=i-k%i;j>0;j--){
            slow = slow->next;
        }
        
        fast->next = ans->next;
        ans->next = slow->next;
        slow->next = NULL;
        return ans->next;
    }
};
