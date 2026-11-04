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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count == 1) return null;
        if(n == count) return head.next;
        int iterationCount = count-n;
        ListNode prev = null;
        temp = head;
        while(iterationCount > 0){
            iterationCount--;
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

        return head;
    }
}



