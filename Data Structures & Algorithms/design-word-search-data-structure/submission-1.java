class WordDictionary {

    class TrieNode{

        TrieNode[] c;
        boolean isEnd;

        TrieNode(){
            this.isEnd = false;
            this.c = new TrieNode[26];
        }

    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode temp = root;
        for(char ch : word.toCharArray()){
            if(temp.c[ch-'a'] == null) temp.c[ch-'a'] = new TrieNode();
            temp = temp.c[ch-'a'];
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode temp = root;
        return search(word,temp);
    }

    private boolean search(String word, TrieNode root){
        TrieNode temp = root;
        for(int cc = 0; cc < word.length(); cc++){
            char ch = word.charAt(cc);
            if(ch == '.'){
                boolean ans = false;
                for(int i = 0; i < 26; i++){
                    if(temp.c[i] != null) {
                        ans = search(word.substring(cc+1), temp.c[i]);
                    }
                    if(ans == true) return true;
                }
                return false;
            }else{
                if(temp.c[ch-'a'] == null) return false;
                temp = temp.c[ch-'a'];
            }
        }
        return temp.isEnd;
    }

}
