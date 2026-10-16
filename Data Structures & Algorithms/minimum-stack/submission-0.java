class MinStack {

    private InternalLinkedList lastNode = null;
	
	public MinStack() {
		
    }
    
    public void push(int val) {
    		InternalLinkedList node = new InternalLinkedList();
    		node.setVal(val);
    		if(lastNode == null) node.setMinVal(val);
    		else node.setMinVal(Math.min(lastNode.getMinVal(), val));
    		if(lastNode == null) {
    			lastNode = node;
    		} else {
    			node.prevNode = lastNode;
    			lastNode = node;
    		}
    }
    
    public void pop() {
    		int v = lastNode.getVal();
    		lastNode = lastNode.getPrevNode();
    }
    
    public int top() {
    		return lastNode.getVal();
    }
    
    public int getMin() {
    		return lastNode.getMinVal();
    }
    
    private class InternalLinkedList {
    		private int val;
    		private int minVal;
    		
    		private InternalLinkedList prevNode;
    		
    		public int getVal() {
    			return this.val;
    		}
    		
    		public void setVal(int val) {
    			this.val = val;
    		}
    		
    		public int getMinVal() {
    			return this.minVal;
    		}
    		
    		public void setMinVal(int minVal) {
    			this.minVal = minVal;
    		}
    		
    		public InternalLinkedList getPrevNode() {
    			return this.prevNode;
    		}
    		
    		public void setPrevNode(InternalLinkedList nextNode) {
    			this.prevNode = nextNode;
    		}
    }


}
