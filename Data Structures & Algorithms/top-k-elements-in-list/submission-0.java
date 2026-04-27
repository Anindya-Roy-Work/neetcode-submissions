class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)-> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> m : mp.entrySet()){
            pq.offer(new int[]{m.getValue(),m.getKey()});
            if(pq.size() > k) pq.poll();
        }
        int[] ans = new int[k];
         k = 0;
        while(!pq.isEmpty()){
            ans[k++] = pq.poll()[1];
        }
        return ans;
    }
}
