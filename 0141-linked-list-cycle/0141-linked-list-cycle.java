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
        boolean isCycle = false;
        if (head == null) return isCycle;
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                isCycle = true;
                break;
            }
        }
        
        return isCycle;
    }
    /*
    
    
    Find times of iterations 
    1) non cycle -> O(n) nodes수만큼 linear search
    2) cycle 
    2-1) steps until slow pointer enter the cycle 
    non-cyclic length = N nodes -> O(N)
    
    2-2) steps when both pointers in cycle 
    speed : fast = 2 nodes/iteration, slow = 1 nodes/iteration
    relative speed of fast = 2 - 1 = 1 nodes/iteration
    cyclic length = K nodes 
    
    distance between slow and fast = relative speed * "x"times iterations
    x iterations = distance / relative speed 
    
    As distance is at most cyclic length K --(1)
    and speed difference is 1 --(2)
    x iterations = K / 1 = K
    -> O(K)
    
    => O(N+K) = O(n)

    */
}