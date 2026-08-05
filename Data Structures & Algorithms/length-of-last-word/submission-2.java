class Solution {
    public int lengthOfLastWord(String s) {
        String[] t = s.trim().split(" ");
        return t[t.length-1].length();
    }
}