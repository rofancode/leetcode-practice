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
        // odd 일 때 next = next
        // even 따로 저장
        // even 으로 끝남 -> next.next = null
        // odd로 끝남 -> next  = null -> 연결
        if ( head == null || head.next == null) return head;
        
        ListNode dummyHead = new ListNode(0, head);
        ListNode curr = dummyHead.next;
        ListNode evenHead = new ListNode(0);
        ListNode even = evenHead;
        while(curr.next != null && curr.next.next != null){// 앞에 2개 남아있어야함
            //even 처리
            even.next = curr.next;
            curr.next = curr.next.next;
            curr = curr.next;
            even = even.next;
        }
        

        
        // odd로 끝난경우 curr.next = null
        // curr.next 는 있고 curr.next.next = null
        if (curr.next != null) {
            even.next = curr.next;
            even = even.next;
        }
        even.next = null;
        curr.next = evenHead.next;
        
        
        return dummyHead.next;
    }
}