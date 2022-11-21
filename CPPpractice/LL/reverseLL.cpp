//https://leetcode.com/problems/reverse-linked-list/submissions/846886587/

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
    ListNode* reverseList(ListNode* head) {
       
        struct ListNode *cur = head;
        struct ListNode *prev = NULL;
        struct ListNode *next = NULL;
        if (head==NULL){
            return head;
        }
        while(cur->next!=NULL){
            
            next = cur->next;
            cur->next=prev;
            prev = cur;
            //cout<<cur->info;
            cur = next;
            
            
        }
        cur->next=prev;
        head=cur;
        return head;
    }
};
