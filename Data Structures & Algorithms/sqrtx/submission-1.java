class Solution {
    public int mySqrt(int x) {
        int s = 0, e = x, res = 0;
        while(s<=e){
            int m = s+(e-s)/2;
            if((long)m*m == x) return m;
            if((long)m*m > x) e = m-1;
            else{
                s = m+1;
                res = m;
            }
        }
        return res;
    }
}