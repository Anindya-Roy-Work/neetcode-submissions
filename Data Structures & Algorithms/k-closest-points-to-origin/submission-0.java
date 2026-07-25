class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((b,a)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
        for(int[] point : points){
            pq.offer(point);
            if(pq.size() > k) pq.poll();
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while(!pq.isEmpty()){
            int[] p = pq.poll();
            ans[i][0] = p[0];
            ans[i][1] = p[1];
            i++;
        }
        return ans;
    }
}
