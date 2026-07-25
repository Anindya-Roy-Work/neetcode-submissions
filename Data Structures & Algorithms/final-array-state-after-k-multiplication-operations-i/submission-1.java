class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(a[1]==b[1])?(a[0]-b[0]):(a[1]-b[1]));
        int n = nums.length;
        for(int i = 0; i < n; i++){
            pq.offer(new int[]{i,nums[i]});
        }
        while(k-->0){
            int[] x = pq.poll();
            x[1]*=multiplier;
            pq.offer(x);
        }
        int[] ans = new int[n];
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            ans[x[0]] = x[1];
        }
        return ans;
    }
}