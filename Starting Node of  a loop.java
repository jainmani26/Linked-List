public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head , fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                break;   //cycle detected
        }
        if (fast == null || fast.next == null)
            return null;   //no cycle found
        
         ListNode curr1 = head , curr2 = slow;
        //move both the pointers with same speed
        while(curr1 != curr2)
        {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1;
    }
}
