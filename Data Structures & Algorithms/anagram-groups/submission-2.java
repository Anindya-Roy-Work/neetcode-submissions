class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lis = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String x = new String(ch);
            List<String> l = mp.getOrDefault(x, new ArrayList<>());
            l.add(str);
            mp.put(x,l);
        }
        return new ArrayList<>(mp.values());
    }
}
