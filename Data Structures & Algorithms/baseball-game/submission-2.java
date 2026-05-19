class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int x = st.pop();
                int y = st.pop();
                st.push(y);
                st.push(x);
                st.push(x+y);
            }else if(op.equals("D")){
                st.push(2*st.peek());
            }else if(op.equals("C")){
                st.pop();
            }else st.push(Integer.parseInt(op));
        }
        int val = 0;
        while(!st.isEmpty()) val+=st.pop();
        return val;
    }
}