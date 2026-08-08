class RandomizedSet {

    //Map is for Value to Index storage
    //List is for Value storage
    private Map<Integer,Integer> mp;
    private List<Integer> lis;
    private static Random rand;

    public RandomizedSet() {
        System.out.println("I am initing");
        mp = new HashMap<>();
        lis = new ArrayList<>();
        rand = new Random();

    }
    
    public boolean insert(int val) {
        //If map contains val, return false
        //Insert <val-index> into map.
        //Add val to list.
        System.out.println("I am inserting");
        if(mp.containsKey(val)) return false;
        int size = lis.size();
        lis.add(val);
        mp.put(val,size);
        return true;
    }
    
    public boolean remove(int val) {
        //If map does not contain val, return false
        System.out.println("I am removing");
        if(!mp.containsKey(val)) return false;
        //Find index in list of val
        int idx = mp.get(val);
        mp.remove(val);
        //Substitute with last element in list and update the map index also.
        int size = lis.size();
        if(idx == size-1){
            lis.remove(size-1);
            return true;
        }
        int v = lis.get(size-1);
        lis.set(idx,v);
        mp.put(v,idx);
        lis.remove(size-1);
        return true;
    }
    
    public int getRandom() {
        System.out.println("I am outputing");
        return lis.get(rand.nextInt(lis.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */