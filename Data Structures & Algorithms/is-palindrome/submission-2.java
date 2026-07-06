class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        return fair(sb.toString());
    }

    private boolean fair(String s){
        int len = s.length();
        System.out.print(s);
        s = s.toLowerCase();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }

}
