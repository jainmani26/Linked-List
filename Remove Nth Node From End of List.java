public ListNode removeNthFromEnd(ListNode head, int n)
    {
        
        ListNode start = new ListNode(); //dummy node
        start.next = head; //dummy node is initially at head
        ListNode fast = start;
        ListNode slow = start;
        
        for(int i = 1; i <= n; ++i)
            fast = fast.next; //Move fast to n steps forward
    
        while(fast.next != null) //move both slow and fast 1 step forward
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next; //break the link
        
        return start.next;
    }
