class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> c = new HashMap<>();
        for(int n : nums){
            c.put(n,c.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer> mp : c.entrySet()){
            int[] ar = new int[2];
            ar[0] = mp.getKey();
            ar[1] = mp.getValue();
            pq.offer(ar);
            if(pq.size() > k) pq.poll();
        }
        int[] ans  = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            ans[i++] = pq.poll()[0];
        }
        return ans;
    }
}
