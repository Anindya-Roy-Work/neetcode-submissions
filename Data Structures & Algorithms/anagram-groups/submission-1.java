class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs == null || strs.length == 0) return res;
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs){
            int[] c = new int[26];
            for(char ch : str.toCharArray()){
                c[ch-'a']++;
            }
            String cc = Arrays.toString(c);
            //mp.put(c,mp.getOrDefault(c,new ArrayList<String>()).add(str));
            mp.computeIfAbsent(cc, k->new ArrayList<>()).add(str);
        }
        for(Map.Entry<String, List<String>> e : mp.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}
