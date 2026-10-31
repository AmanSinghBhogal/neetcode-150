class LRUCache {

    class Node{
		int key;
		int val;
		Node prev;
		Node next;
		public Node(int key, int val) {
			this.key = key;
			this.val = val;
			this.prev= null;
			this.next = null;
		}
	}
	HashMap<Integer, Node> map = new HashMap<>();
	Node head, tail;
	int size;
	public LRUCache(int capacity) {
		head = new Node(-1,-1);
		tail = new Node(-1,-1);
		head.next = tail;
		tail.prev = head;
		size = capacity;
	}

	public int get(int key) {
		if (!map.containsKey(key)) {
            return -1;
        }
		Node nodeToShift = map.get(key);
		removeNode(nodeToShift);
		addNode(nodeToShift);
		return nodeToShift.val;
	}

	public void put(int key, int value) {
		if(map.containsKey(key)) {
			Node nodeToRemove = map.get(key);
			removeNode(nodeToRemove);
			map.remove(key);
		}

    	if(map.size() == size) {
    		Node nodeToRemove = tail.prev;
    		removeNode(nodeToRemove);
    		map.remove(nodeToRemove.key);
    	}
    	
		Node newNode = new Node(key, value);
		addNode(newNode);
		map.put(key, newNode);
	}
	
	public void addNode(Node node) {
		Node oldNext = head.next;
		head.next = node;
		oldNext.prev = node;
		node.next = oldNext;
		node.prev = head;
	}
	
	public void removeNode(Node node) {
		Node oldPrev = node.prev;
    	Node oldNext = node.next;
    	oldPrev.next = oldNext;
    	oldNext.prev = oldPrev;
	}

}
