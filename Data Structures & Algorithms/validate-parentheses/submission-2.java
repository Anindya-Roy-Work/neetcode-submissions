class Solution {
    private static Map<Character,Character> mp;
    static{
        mp = new HashMap();
        mp.put(']','[');
        mp.put('}','{');
        mp.put(')','(');
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                if(!st.isEmpty() && st.peek() == mp.get(ch)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
