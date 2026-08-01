class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lis  = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        lis.add(l1);
        for(int i = 1; i < numRows; i++){
            List<Integer> ll = new ArrayList<>();
            List<Integer> pl = lis.get(i-1);
            ll.add(pl.get(0));
            for(int j = 0; j < pl.size()-1; j++){
                ll.add(pl.get(j)+pl.get(j+1));
            }
            ll.add(pl.get(pl.size()-1));
            lis.add(ll);
        }
        return lis;
    }
}