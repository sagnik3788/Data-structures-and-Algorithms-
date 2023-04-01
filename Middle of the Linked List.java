class Solution {
    public ListNode middleNode(ListNode head) {
      ListNode hare =head;
      ListNode turtle=head;
      while(hare!=null&&hare.next!=null){
          hare=hare.next.next;
          turtle=turtle.next;
      }
      return turtle;
    }
}
