class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

      ListNode dummy = new ListNode();
      ListNode curr = dummy;

      while(list1 != null && list2 != null){
        if(list1.val > list2.val){
          curr = list1;
          list1 = list1.next;
        }
        else{
          curr = list2;
          list2 = list2.next;
        }
        curr = curr.next;
      }
      curr.next = (list1 != null) ? list1 : list2;
      return dummy.next;
    }
}
