/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode ans;
    public ListNode reverseList(ListNode head) {
            if(head==null){
            return head;
        }
          reverse(head).next=null;
       return ans;
    }
    public  ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            ans = head;
            return head;
        }
        ListNode left = head;
    
        ListNode right = reverse(head.next);
         
        right.next = left;
       right = right.next;
        return right;
    }
    }
