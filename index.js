public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        while(headA==null||headB==null){
            return null;
        }
         ListNode curr1=headA;
        ListNode curr2=headB;
      while(curr1!=curr2){
          if(curr1==null){
              curr1=headB;
          }
          else{
              curr1=curr1.next;
          }
          if(curr2==null){
              curr2=headA;
          }
          else{
              curr2=curr2.next;
          }
      
        }
        return curr1;
    }
}
