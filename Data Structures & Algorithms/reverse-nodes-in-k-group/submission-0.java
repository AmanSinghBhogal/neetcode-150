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
		Stack<ListNode> st = new Stack();
		ListNode tmp = head, tail = null;
		head = null;
		while(tmp != null) {
			st.push(tmp);
			tmp = tmp.next;
			if(st.size() == k) {
				while(!st.isEmpty()) {
					if(head == null) {
						head = st.pop();
						head.next = null;
						tail = head;
					} else {
						tail.next = st.pop();
						tail = tail.next;
						tail.next = null;
					}
				}
			}
		}
		
		while(!st.isEmpty()) {
			tmp = st.pop();
		}
		tail.next = tmp;
        return head;
    }
}
