class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        /*
        for(int i = 0; i < len; i++){
            String newStr = s.substring(0,i)+s.substring(i+1,len);
            //System.out.println(newStr);
            if(isPalindrome(newStr)) return true;
        }
        return isPalindrome(s);
        */
        int st = 0;
        int en = len-1;
        while(st<en){
            if(s.charAt(st) != s.charAt(en)){
                return isPalindrome(s,st+1,en) || isPalindrome(s,st,en-1);
            }
            st++;
            en--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int st, int en){
        while(st<en){
            if(s.charAt(st) != s.charAt(en)) return false;
            st++; en--;
        }
        return true;
    }

    /*
    private boolean isPalindrome(String s){
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }
    */

}