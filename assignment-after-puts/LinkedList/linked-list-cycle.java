/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
         if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
       

if(fast==null||slow==null){
    return false;
}
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
            return true;
        }
        }
        
  
            return false; 
    }
}