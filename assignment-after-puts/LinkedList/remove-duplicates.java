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
 public ListNode deleteDuplicates(ListNode head) {
       removeDuplicate(head);
       return head;
    }
public void removeDuplicate(ListNode head){
    if(head==null){
        return;
    }
        ListNode node = head;
        while(node.next!=null){
            if(node.next!=null&&node.next.val==node.val){
                node.next = node.next.next;
           
            }
            else{
                node = node.next;
            }
        }
}
}