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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null || list2 == null) return (list1 != null) ? list1 : list2;
		if(list1 == null && list2 == null) return list1;
		ListNode mergedHead = null, mergeEnd = null;
		while(list1 !=null || list2 != null) {
			if(list1 == null) {
				mergeEnd.next = list2;
				list2 = list2.next;
				mergeEnd = mergeEnd.next;
				continue;
			} else if(list2 == null) {
				mergeEnd.next = list1;
				list1 = list1.next;
				mergeEnd = mergeEnd.next;
				continue;
			}
			if(mergedHead == null) {
				mergedHead = (list1.val < list2.val? list1 : list2);
				mergeEnd = mergedHead;
			} else {
				mergeEnd.next = (list1.val < list2.val? list1 : list2);
				mergeEnd = mergeEnd.next;
			}
			if(list1.val < list2.val) list1 = list1.next;
			else list2 = list2.next;
		}
        return mergedHead;
    }
}