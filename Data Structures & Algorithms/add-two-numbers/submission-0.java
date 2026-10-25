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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode result = null, tail = null;
		while(l1 != null || l2!=null || carry!=0) {
			int sum = (l1!=null? l1.val:0)+(l2!=null?l2.val:0)+carry;
			carry = (sum>9? 1: 0);
			sum = sum%10;
			if(result == null) {
				result = new ListNode(sum);
				tail = result;
			} else {
				tail.next = new ListNode(sum);
				tail = tail.next;
			}
			l1 = (l1!=null ?l1.next:null);
			l2 = (l2!=null ? l2.next:null);
		}
		
        return result;
    }
}
