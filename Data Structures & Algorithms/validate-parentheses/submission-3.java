class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mp = new HashMap<>();
        mp.put(']','[');mp.put(')','(');mp.put('}','{');
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                if(st.isEmpty()) return false;
                if(st.peek() == mp.get(ch)) st.pop();
                else st.push(ch);
            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
