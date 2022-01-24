public ListNode deleteMiddle(ListNode head) {
        
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return null;
        }
        ListNode slow = head, fast = head , prev = null;
        
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
