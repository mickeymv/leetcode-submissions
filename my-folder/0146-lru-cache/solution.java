public class LRUCache {

    static final class Node {
        int key,value;
        Node pre,next;
        public Node(int key, int value) {
            this.key=key;
            this.value=value;
            pre=next=null;
        }
    }
    
    private Node head = new Node(0,-1), tail = new Node(0,-1);
    
    private HashMap<Integer, Node> map = new HashMap<Integer, Node>();

    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            addToTail(node);
            return node.value;
        } else {
            return -1;
        }
    }
    
    private void addToTail(Node node) {
        Node temp = node.pre;
        node.pre.next = node.next;
        node.next.pre = temp;
        
        node.pre = tail.pre;
        tail.pre.next = node;
        node.next = tail;
        tail.pre = node;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            map.put(key,node);
            addToTail(node);
            return;
        } else if (map.size() == capacity) {
            deleteHead();
        }
        Node node = new Node(key,value);
        node.pre = tail.pre;
        node.next = tail;
        tail.pre=node;
        map.put(key,node);
        addToTail(node);
    }
    
    private void deleteHead() {
        map.remove(head.next.key);
        head.next = head.next.next;
        head.next.pre = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
