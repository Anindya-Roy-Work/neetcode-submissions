class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res =new ArrayList<>();
        if(strs.length == 0) return res;
        Map<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            int[] freq = new int[26];
            Arrays.fill(freq,0);
            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i <26; i++){
                while(freq[i] > 0){
                    sb.append((char)i+'a');
                    freq[i]--;
                }
            }
            String sss = sb.toString();
            List<String> ss = mp.getOrDefault(sss, new ArrayList<>());
            ss.add(s);
            mp.put(sss,ss);
        }
        for(Map.Entry<String, List<String>> e : mp.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}
