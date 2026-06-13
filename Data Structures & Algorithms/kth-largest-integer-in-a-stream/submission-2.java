class KthLargest {

    PriorityQueue<Integer> pq;
    int count;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(k);
        count = k;
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if(pq.size() == count){
            if(pq.peek() < val){
                pq.poll();
                pq.add(val);
            }
        } else
            pq.add(val);
        return pq.peek();
    }
}