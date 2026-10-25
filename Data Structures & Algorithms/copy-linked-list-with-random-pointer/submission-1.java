/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {	
		
		// Step 1 create a parallel new list:
		Node oldNode = head, newNode = null, newHead = null;
		HashMap<Node, Node> index = new HashMap<>();
		while(oldNode != null) {
			if(newHead == null) {
				newHead = new Node(oldNode.val);
				newNode = newHead;
			} else {
				Node tmp = new Node(oldNode.val);
				newNode.next = tmp;
				newNode = tmp;
			}
			index.put(oldNode, newNode);
			oldNode = oldNode.next;
		}
		oldNode = head;
		newNode = newHead;
		while(oldNode != null) {
			newNode.random = index.getOrDefault(oldNode.random, null);
			oldNode = oldNode.next;
			newNode = newNode.next;
		}
		
		return newHead;
	}
}
