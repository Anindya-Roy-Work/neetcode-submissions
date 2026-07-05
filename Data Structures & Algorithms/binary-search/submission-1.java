class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return bin(nums,0,n-1,target);
    }

    private int bin(int[] n, int s, int e, int t){
        while(s<=e){
            int m = (s+e)/2;
            if(n[m] == t) return m;
            if(n[m] < t) s = m+1;
            else e = m-1;
        }
        return -1;
    }

}
