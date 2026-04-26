class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');
        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                if(!st.isEmpty() && st.peek() == mp.get(ch)){
                    st.pop();
                }
                else return false;
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
