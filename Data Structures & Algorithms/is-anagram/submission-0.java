class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!mp.containsKey(ch)) return false;
            if(mp.get(ch) == 0) return false;
            mp.put(ch,mp.get(ch)-1);
        }
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}
