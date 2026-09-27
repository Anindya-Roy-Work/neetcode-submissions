class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int y = columnNumber%26;
            columnNumber-=y;
            sb.append((char)(y+'A'));
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}