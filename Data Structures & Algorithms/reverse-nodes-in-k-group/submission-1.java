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
		ListNode tmp = head, prevGroupHead = null;
		while(c<k) {
			if(tmp == null) return head;
			c++;
			ListNode l = tmp.next;
			if(c == k) tmp.next= null;
			tmp = l;
		}
		if(tmp != null) prevGroupHead = reverseKGroup(tmp,k);
		
		ListNode p = null;
		tmp = head;
		while(tmp != null) {
			ListNode t = tmp.next;
			tmp.next = p;
			p = tmp;
			tmp = t;
		}
		head.next = prevGroupHead;
	    return p;
  }
}
