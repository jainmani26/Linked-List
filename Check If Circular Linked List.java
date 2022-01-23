class GfG
{
    boolean isCircular(Node head)
    {
        if(head == null) //0 nodes
            return true;
	    if(head.next ==null) // 1 nodes
            return false;
        
        if (head.next == head)  //self refferential node
            return true;
        
        Node slow = head , fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == head)
                return true;   //cycle detected
        }
        
        return false;  //cycle not detected
    }
}
