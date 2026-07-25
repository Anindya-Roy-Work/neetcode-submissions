class WordDictionary {

    class TrieNode{
        private TrieNode[] ch;
        private boolean isEnd;

        public TrieNode(){
            this.ch = new TrieNode[26];
            this.isEnd = false;
        }

    }

    public TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        int len = word.length();
        TrieNode it = root;
        for(int i = 0; i < len; i++){
            char c = word.charAt(i);
            int x = c-'a';
            if(it.ch[x] == null){
                it.ch[x] = new TrieNode();
            }
            it = it.ch[x];
        }
        it.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode it = root;
        return (dfs(word,it));
    }

    private boolean dfs(String word, TrieNode it){
        int len = word.length();
        for(int i = 0; i < len; i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(int j = 0; j < 26; j++){
                    if(it.ch[j] != null){
                        boolean ans = dfs(word.substring(i+1),it.ch[j]);
                        if(ans == true) return ans;
                    }
                }
                return false;
            }else{
                int x = c-'a';
                if(it.ch[x] == null) return false;
                it = it.ch[x];
            }
        }
        return it.isEnd;
    }

}
