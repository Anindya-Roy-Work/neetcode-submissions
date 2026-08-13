class KthLargest {

    PriorityQueue<Integer> pq;
    int[] n;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>((a,b)->a-b);
        n = nums;
        this.k = k;
        for(int i = 0; i < nums.length; i++){
            pq.offer(nums[i]);
            if(pq.size() > k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }
}
