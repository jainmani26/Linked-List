 public void deleteNode(ListNode Node) {
        if(Node==null)
           return;
        
        Node.val = Node.next.val; //Copy the data of next node 
        Node.next = Node.next.next; 
        return;
    }
