class LRUCache {


  class DoubleLinkedListNode
  {
    public int key;
    public int val;
    public DoubleLinkedListNode next;
    public DoubleLinkedListNode prev;
    

  }


    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;


   private Map<Integer, DoubleLinkedListNode> keyNodeAddressMap;
   private int maxCapacity;     

    public LRUCache(int capacity) {

        head = new DoubleLinkedListNode();
        tail = new DoubleLinkedListNode();

        head.prev = null;
        head.next = tail;

        tail.next = null;
        tail.prev = head;

        keyNodeAddressMap = new HashMap<>(capacity);
        maxCapacity = capacity;

        
    }
    
    public int get(int key) {

        if (!keyNodeAddressMap.containsKey(key))
         return -1;

         DoubleLinkedListNode node = keyNodeAddressMap.get(key);
         moveToHead(node);
         return node.val;
        
    }
    
    public void put(int key, int value) {

      if(keyNodeAddressMap.containsKey(key)) {
        DoubleLinkedListNode node = keyNodeAddressMap.get(key);
        node.val = value;
        moveToHead(node);
        return;
    }


    DoubleLinkedListNode node = new DoubleLinkedListNode();
    node.key = key;
    node.val = value;
    keyNodeAddressMap.put(key, node);
    addToHead(node);

    if(keyNodeAddressMap.size() > maxCapacity) {

        DoubleLinkedListNode lru = tail.prev;
        keyNodeAddressMap.remove(lru.key);
        removeNode(lru);
    }
}


private void moveToHead(DoubleLinkedListNode node){

    removeNode(node);
    addToHead(node);
}

private void addToHead(DoubleLinkedListNode node){
             
             node.prev = head;
             node.next = head.next;
             head.next.prev = node;
             head.next = node;

 }

 private void removeNode(DoubleLinkedListNode node){

        DoubleLinkedListNode prevNode = node.prev;
        DoubleLinkedListNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;



 }



}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */