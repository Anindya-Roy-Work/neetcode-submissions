class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<int[]> st = new Stack<>();
        for(int i = 0; i < n; i++){
            int t = temperatures[i];
            while(!st.isEmpty() && st.peek()[0] < t){
                int[] res = st.pop();
                ans[res[1]] = i-res[1];
            }
            st.push(new int[]{t,i});
        }

        return ans;

    }
}
