public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if(head == null || head.next ==null) //0 or 1 nodes
            return false;
        
        if (head.next == head)  //self refferential node
            return true;
        
        ListNode slow = head , fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return true;   //cycle detected
        }
        
        return false;  //cycle not detected
        
    }
}
