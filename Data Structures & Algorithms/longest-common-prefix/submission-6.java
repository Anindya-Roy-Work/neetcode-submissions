class Solution {
    public String longestCommonPrefix(String[] strs) {
        String c=new String();
        int len = strs.length;
        int minLen = minlength(strs);
        for(int i = 0; i < minLen; i++){
            char ch = strs[0].charAt(i);
            int flag = 0;
            for(int j = 0; j < len; j++){
                
                if(strs[j].length() < i || strs[j].charAt(i) != ch){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) break;
            else c = c+ch;
        }
        return String.valueOf(c);
    }

    private int minlength(String[] strs){
        int minLen = 201;
        for(String s : strs){
            minLen = Math.min(minLen, s.length());
        }
        return minLen;
    }

}