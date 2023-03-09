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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        /* 
        1 -> 2 -> 3 -> 4 -> 5
        
        1. 연결이 끊어지면 안돼 그럼 다음 node확인이 어려워
        2. 방향 변경할 때 필요한 항목들을 저장해두자
        4. 2의 방향을 변경하려면 우선 1 pre정보 필요하고, next변경한뒤에는 next 확인불가하니 next 저장필요
        5. curr.next = pre
        6. 변경한 다음에 pre = curr , curr = next 넣으면 되겠다 
        7. loop 순서대로 진행한 다음에 curr.next == null 일 떄 curr return 
        */
        //4,5 번
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        
        return pre;
    } // time O(n) , space O(n)
}