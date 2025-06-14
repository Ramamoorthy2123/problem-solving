public class Solution {
    public boolean hasCycle(ListNode head) {

      if(head == null) 
        return false;
      ListNode slowPtr = head,
        fastPtr = head;
      while(fastPtr != null && fastPtr.next != null){
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;
        if(slowPtr == fastPtr)
            return true;
      }
      return false;
      
    }
}
