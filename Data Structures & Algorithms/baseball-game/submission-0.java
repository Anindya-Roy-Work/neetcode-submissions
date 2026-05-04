class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int x = st.pop();
                int y = st.pop();
                st.push(y);
                st.push(x);
                st.push(x+y);
            }
            else if (s.equals("C")) st.pop();
            else if (s.equals("D")) st.push(st.peek()*2);
            else st.push(Integer.parseInt(s));
        }
        int val = 0;
        while(!st.isEmpty()) val+=st.pop();
        return val;
    }
}