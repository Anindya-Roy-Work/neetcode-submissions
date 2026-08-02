class Solution {

    class TrieNode{
        TrieNode[] ch;
        boolean isEnd;

        TrieNode(){
            this.ch = new TrieNode[26];
            this.isEnd = false;
        }
    }

    TrieNode root = new TrieNode();

    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for(String str : strs){
            minLen = Math.min(minLen, str.length());
            TrieNode temp = root;
            for(char c : str.toCharArray()){
                int v = c-'a';
                if(temp.ch[v] == null) temp.ch[v] = new TrieNode();
                temp = temp.ch[v];
            }
            temp.isEnd = true;
        }
        TrieNode temp = root;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            int c = 0;
            char x = 'a';
            int i = 0;
            boolean isEnd = false;
            for(i = 0; i < 26; i++){
                if(temp.ch[i] != null){
                    c++;
                    x = (char)(i+'a');
                }
            }
            if(c == 1){
                sb.append(x);
                temp = temp.ch[x-'a'];
                isEnd = temp.isEnd;
                if(isEnd == true) break;
            }
            else{
                break;
            }
        }
        return sb.toString().substring(0,Math.min(minLen,sb.length()));
    }
}