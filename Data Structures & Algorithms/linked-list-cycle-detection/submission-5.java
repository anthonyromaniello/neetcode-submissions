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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = slowPointer.next.next;
    
        while (slowPointer != null && fastPointer != null) {
            if (slowPointer == fastPointer) return true;
            else if (slowPointer.next != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }else break;
        } return false;
    }
}
