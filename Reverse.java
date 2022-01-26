//Reverse a LL - Pointer Iterative Method

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while(curr != null)
        {
            ListNode ahead = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        
        head = prev;
        return head;
    }
}
