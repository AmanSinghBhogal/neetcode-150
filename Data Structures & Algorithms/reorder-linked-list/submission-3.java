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
        ListNode r = reverseList(tmp);
        ListNode l = head;
        while(l != r) {
            	if(r.next == null) break;
        		ListNode tmp1 = l.next;
        		ListNode t2 = r.next;
        		l.next = r;
        		r.next = tmp1;
        		l = tmp1;
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
