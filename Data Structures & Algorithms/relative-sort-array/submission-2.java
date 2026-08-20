class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int num : arr1){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        int i = 0;
        for(int num : arr2){
            int count = mp.get(num);
            while(count > 0){
                ans[i++] = num;
                count--;
            }
            mp.put(num,0);
        }
        for(int num : mp.keySet()){
            int c = mp.get(num);
            while(c > 0){
                ans[i++] = num;
                c--;
        
            }
            mp.put(num,0);
        }
        return ans;
    }
}