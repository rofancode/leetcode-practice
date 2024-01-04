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
    public ListNode oddEvenList(ListNode head) {
        
        if ( head == null) return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        
        while(odd.next != null && odd.next.next != null){// 앞에 2개 남아있어야함
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
           
        return head;
    }
}