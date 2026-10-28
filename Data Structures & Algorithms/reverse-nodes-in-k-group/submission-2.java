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
    public ListNode reverseKGroup(ListNode head, int k) {
		int c = 0;
		ListNode tmp = head, prevGroupHead = null,p = null;
		while(c<k) {
			if(tmp == null) return head;
			c++;
			tmp = tmp.next;
		}
		if(tmp != null) prevGroupHead = reverseKGroup(tmp,k);
		tmp = head;
		c =0;
		while(c < k) {
			c++;
			ListNode t = tmp.next;
			tmp.next = p;
			p = tmp;
			tmp = t;
		}
		head.next = prevGroupHead;
	    return p;
  }
}
