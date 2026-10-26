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
   public ListNode sortList(ListNode head) {
		if(head == null || head.next == null) return head;
		
		boolean swapped;
		do {
	        swapped = false;
	        ListNode tmp = head;

	        while (tmp.next != null) {
	            if (tmp.val > tmp.next.val) {
	                int t = tmp.val;
	                tmp.val = tmp.next.val;
	                tmp.next.val = t;
	                swapped = true;
	            }
	            tmp = tmp.next;
	        }
	    } while (swapped);
		
        return head;
    }
}
