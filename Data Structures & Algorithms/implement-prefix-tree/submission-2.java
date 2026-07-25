class PrefixTree {

    class TrieNode{

        TrieNode ch[];
        boolean isEnd;

        public TrieNode(){
            this.ch = new TrieNode[26];
            this.isEnd = false;
        }

    }

    TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        int len = word.length();
        TrieNode it = root;
        for(int i = 0; i < len; i++){
            char c = word.charAt(i);
            if(it.ch[c-'a'] == null){
                it.ch[c-'a'] = new TrieNode();
            }
            it = it.ch[c-'a'];
        }
        it.isEnd = true;
    }

    public boolean search(String word) {
        int len = word.length();
        TrieNode it = root;
        for(int i = 0; i < len; i++){
            char c = word.charAt(i);
            if(it.ch[c-'a'] == null){
                return false;
            }
            it = it.ch[c-'a'];
        }
        return it.isEnd;
    }

    public boolean startsWith(String prefix) {
        int len = prefix.length();
        TrieNode it = root;
        for(int i = 0; i < len; i++){
            char c = prefix.charAt(i);
            if(it.ch[c-'a'] == null){
                return false;
            }
            it = it.ch[c-'a'];
        }
        return true;
    }
}
