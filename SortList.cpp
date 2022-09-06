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
    ListNode* sortList(ListNode* head) {
        if(head == NULL || head->next == NULL){
            return head;
        }
        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* prev = NULL;
        while(fast != NULL && fast->next != NULL){
            prev = slow;
            slow = slow->next;
            fast = fast->next->next;
        }
        prev->next = NULL;
        ListNode* left = sortList(head);
        ListNode* right = sortList(slow);
        return merge(left, right);
    }
    
    public:
    ListNode* merge(ListNode* left, ListNode* right){
        ListNode* ans = new ListNode(0);
        ListNode* curr = ans;
        while(left != NULL && right != NULL){
            if(left->val < right->val){
                curr->next = left;
                left = left->next;
            }else{
                curr->next = right;
                right = right->next;
            }
            curr = curr->next;
        }
        if(left != NULL){
            curr->next = left;
        }
        if(right != NULL){
            curr->next = right;
        }
        return ans->next;
    }
    };
