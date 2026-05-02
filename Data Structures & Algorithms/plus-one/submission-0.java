class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> lis = new ArrayList<>();
        int c = 0;
        for(int i = digits.length - 1; i>= 0; i--){
            int val = digits[i]+c;
            val+=(i==digits.length-1)?1:0;
            c = val/10;
            lis.add(val%10);
        }
        if(c==1) lis.add(c);
        int[] ans = new int[lis.size()];
        for(int i = ans.length-1; i >= 0; i--){
            ans[i] = lis.get(ans.length-1-i);
        }
        return ans;
    }
}
