class MyCircularQueue {

    class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    Node node;
    int count;
    Node first;
    Node last;
    int c;

    public MyCircularQueue(int k) {
        count = k;
        c = 0;
    }
    
    public boolean enQueue(int value) {
        if(c == 0){
            node = new Node(value);
            first = last = node;
            c++;
            return true;
        }
        if(c == count){
            return false;
        }

            last.next = new Node(value);
            last = last.next;
            first.prev = last;
            last.next = first;
            c++;
            return true;
        
    }
    
    public boolean deQueue() {
        if(c==0) return false;
        c--;
        if(c==0) return true;
        Node temp = first;
        first = first.next;
        first.prev = last;
        last.next = first;
        return true;
    }
    
    public int Front() {
        if(c==0) return -1;
        return first.val;
    }
    
    public int Rear() {
        if(c==0) return -1;
        return last.val;
    }
    
    public boolean isEmpty() {
        return c==0;
    }
    
    public boolean isFull() {
        return c==count;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */