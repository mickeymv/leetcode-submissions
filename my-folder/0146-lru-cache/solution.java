class Node {
    int key, val;
    Node left, right;

    public Node(int key, int value) {
        this.key = key;
        this.val = value;
    }
}

class LRUCache {

    int capacity;
    Node lru = new Node(-1,-1), mru = new Node(-1,-1);
    Map<Integer, Node> keysToNodes = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        lru.right = mru;
        mru.left = lru;
    }
    
    public int get(int key) {
        if(!keysToNodes.containsKey(key)) {
            return -1;
        }

        Node node = keysToNodes.get(key);
        moveToMru(node);
        return node.val;
    }

    private void moveToMru(Node node) {
        //make sure the nodes left and right nodes
        //point to each other 

        node.left.right = node.right;
        node.right.left = node.left;

        addToMru(node);
    }

    private void addToMru(Node node) {
        //ensure that the mru points to the new node 
        //and that previousMru points to the new node 

        Node previousMru = mru.left;
        mru.left = node;
        previousMru.right = node;
        node.left = previousMru;
        node.right = mru;
    }
    
    public void put(int key, int value) {
        if(!keysToNodes.containsKey(key)) {
            if (capacity == keysToNodes.size()) {
                removeLru();
            }
            Node node = new Node(key, value);
            keysToNodes.put(key, node);
            addToMru(node);
            return;
        }

        Node node = keysToNodes.get(key);
        node.val = value;
        moveToMru(node);
    }

    private void removeLru() {
        //ensure lru points to correct node after removal 

        Node previousLru = lru.right;
        lru.right = previousLru.right;
        previousLru.right.left = lru;
        keysToNodes.remove(previousLru.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
