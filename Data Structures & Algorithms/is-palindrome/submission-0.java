class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch>='A' && ch <='Z') sb.append((char)(ch-'A'+'a'));
            else if((ch>='a' && ch <= 'z') || (ch>='0' && ch<='9')) sb.append(ch);
        }
        System.out.print(sb.toString());
        char[] ch = sb.toString().toCharArray();
        int len = ch.length;
        for(int i = 0; i < len/2; i++){
            if(ch[i] != ch[len-i-1]) return false;
        }
        return true;
    }
}
