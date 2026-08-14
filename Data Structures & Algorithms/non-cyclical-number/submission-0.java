class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1){
            int m = n;
            int sum = 0;
            while(m!=0){
                int t = m%10;
                sum+=t*t;
                m/=10;
            }
            if(s.contains(sum)) return false;
            s.add(sum);
            n=sum;
        }
        return true;
    }
}
