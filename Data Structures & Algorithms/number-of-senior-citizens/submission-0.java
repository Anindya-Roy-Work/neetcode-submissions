class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(String s : details){
            char c1 = s.charAt(11);
            char c2 = s.charAt(12);
            int val = (int)(c1-'0');
            val*=10;
            val+= (int)(c2-'0');
            if(val > 60) c++;
            System.out.print(val);
        }
        return c;
    }
}