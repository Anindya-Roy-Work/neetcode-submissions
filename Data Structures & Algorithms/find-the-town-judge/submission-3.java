class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n+1];
        int[] brr = new int[n+1];
        for(int i = 0; i < trust.length; i++){
            int x = trust[i][0];
            int y = trust[i][1];
            brr[x]++;
            arr[y]++;

        }
        for(int i = 1; i < n+1; i++){
            if(brr[i] == 0 && arr[i] == n-1) return i;
        }
        return -1;
    }
}