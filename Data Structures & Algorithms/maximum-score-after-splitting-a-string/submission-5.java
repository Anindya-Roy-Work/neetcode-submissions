class Solution {
    public int maxScore(String s) {
        int n = s.length();
        if(s.equals("01")) return 2;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = s.charAt(i)-'0';
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = arr[0] == 0?1:0;
        for(int i = 1; i < n; i++){
            pre[i] = pre[i-1]+(arr[i] == 0 ? 1:0);
        }
        suf[n-1] = arr[n-1] == 1?1:0;
        for(int i = n-2; i >= 0; i--){
            suf[i] = suf[i+1]+(arr[i]==1?1:0);
        }
        int maxSum = 0;
        for(int i = 1; i < n; i++){
            maxSum = Math.max(maxSum,pre[i-1]+suf[i]);
        }
        return maxSum;
    }
}