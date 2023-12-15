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
    private int n;
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // 끝까지 가고 next = null 일 때 부터  n--
        // n == 0 일 때 
        this.n = n;
        ListNode pre = new ListNode(-1, head);
        removeNode(pre);
        
        return pre.next;
    }
    
    public void removeNode(ListNode curr) {
        if(curr.next != null) {
            removeNode(curr.next);
            if (n == 0)
                curr.next = curr.next.next;
        }
           
        this.n--;
  
    }
    
}