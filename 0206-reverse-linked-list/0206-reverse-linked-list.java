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
        2. 그럼 서로 바라보게 한 다음에 3. 둘중 한 방향의 next를 바꿔야겠다
        4. next는 1개만 지정할 수 있으니까 next 가 null인 곳에서 시작해야함
        5. 끝으로 가자
        6. 가장 마지막 node, 즉 reverse List의 start가 될 node를 return한다
        */
        //4,5 번
        ListNode startNode = reverseList(head.next);
        
        //2번 4<->5
        head.next.next = head;
        head.next = null;
        
        //
        return startNode;
        
    } // time O(n) , space O(n)
}