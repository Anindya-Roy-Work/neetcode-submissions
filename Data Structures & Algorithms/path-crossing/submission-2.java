class Solution {

    public boolean isPathCrossing(String path) {
        Set<String> seen = new HashSet<>();
        int x = 0, y = 0;
        seen.add(x+","+y);
        for(char ch : path.toCharArray()){
            if(ch == 'N') y++;
            else if (ch == 'S') y--;
            else if (ch == 'E') x++;
            else x--;
            if(seen.contains(x+","+y)) return true;
            seen.add(x+","+y);
        }
        return false;
    }
}