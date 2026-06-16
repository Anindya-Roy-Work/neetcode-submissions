class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append(',');
        }
        sb.append('.');
        for(String str : strs){
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        String count = str.substring(0,str.indexOf('.'));
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i)!='.'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i)!=','){
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for(int s:sizes){
            res.add(str.substring(i,i+s));
            i+=s;
        }
        return res;

    }
}
