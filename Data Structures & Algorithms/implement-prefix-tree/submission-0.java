class PrefixTree {

    class TrieNode{
        TrieNode c[];
        boolean isEnd;

        TrieNode(){
            c = new TrieNode[26];
            isEnd = false;
        }
    }

    TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(temp.c[ch-'a'] == null)
            temp.c[ch-'a'] = new TrieNode();
            temp = temp.c[ch-'a'];
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(temp.c[ch-'a'] == null) return false;
            temp = temp.c[ch-'a'];
        }
        return temp.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char ch : prefix.toCharArray()){
            if(temp.c[ch-'a'] == null) return false;
            temp = temp.c[ch-'a'];
        }
        return true;  
    }
}
