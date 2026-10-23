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
    public void reorderList(ListNode head) {
        int n = 0;
        ListNode tmp = head;
        while(tmp != null) {
        		n++;
        		tmp = tmp.next;
        }
        tmp = head;
        for(int i=0; i< (n/2); i++) {
        		tmp = tmp.next; 
        }
        tmp = reverseList(tmp);
        ListNode l = head, r = tmp;
        while(l != r) {
        		tmp = l.next;
        		ListNode t2 = r.next;
        		if(t2 == null) break;
        		l.next = r;
        		r.next = tmp;
        		l = tmp;
        		r = t2;
        }
    }
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode tmp = head.next;
			head.next = prev;
			prev = head;
			head = tmp;
		}
		return prev;
	}
}
