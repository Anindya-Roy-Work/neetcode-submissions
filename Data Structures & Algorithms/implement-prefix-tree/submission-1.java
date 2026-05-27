class PrefixTree {

    class TrieNode{

        TrieNode ch[];
        boolean isEnd;

        TrieNode(){
            this.isEnd = false;
            this.ch = new TrieNode[26];
        }

    }

    TrieNode root;

    public PrefixTree() {
        root = new TrieNode();     
    }

    public void insert(String word) {
        TrieNode temp = root;
        for(char c : word.toCharArray()){
            if(temp.ch[c-'a'] == null) temp.ch[c-'a'] = new TrieNode();
            temp = temp.ch[c-'a'];
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode temp = root;
        for(char c : word.toCharArray()){
            if(temp.ch[c-'a'] == null) return false;
            temp = temp.ch[c-'a'];
        }
        return temp.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char c : prefix.toCharArray()){
            if(temp.ch[c-'a'] == null) return false;
            temp = temp.ch[c-'a'];
        }
        return true;
    }
}
