class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        for(int s : stones) pq.offer(s);
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x!=y){
                pq.offer((x>y)?(x-y):(y-x));
            }
        }
        return pq.size() == 0 ? 0:pq.poll();
    }
}
