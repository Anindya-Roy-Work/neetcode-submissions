class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String newStr = sb.toString();
        return newStr.equals(sb.reverse().toString());
    }
}
