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
		ListNode tail = null;
		PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> Integer.compare(a.val, b.val)) ;
		while(head != null) {
			heap.add(head);
			head = head.next;
		}
		while(!heap.isEmpty()) {
			if(head == null) {
				head = heap.remove();
				head.next = null;
				tail = head;
			} else {
				tail.next = heap.remove();
				tail = tail.next;
				tail.next = null;
			}
		}
		return head;
    }
}
