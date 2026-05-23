class Solution {

    class TrieNode{
        
        boolean isEnd;
        TrieNode ch[];

        public TrieNode(){
            this.ch = new TrieNode[26];
            this.isEnd = false;
        }

    }

    public String longestCommonPrefix(String[] strs) {
        TrieNode root = new TrieNode();
        for(String str : strs){
            TrieNode temp = root;
            for(char c : str.toCharArray()){
                if(temp.ch[c-'a'] == null){
                    temp.ch[c-'a'] = new TrieNode();
                }
                temp = temp.ch[c-'a'];
            }
            temp.isEnd = true;
        }
        TrieNode dum = root;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(dum!=null && dum.isEnd == false){
            count = 0;
            char chh = 'a';
            TrieNode t = null;
            for(int i = 0; i < 26; i++){
                if(dum.ch[i] != null){
                    count++;
                    chh = (char)(i+'a');
                    t = dum.ch[i];
                    if(count > 1) break;
                }
            }
            if(count == 1){
                sb.append(chh);
                dum = t;
            }
            if(count!=1) break;
        }
        return sb.toString();
    }
}