class SmallestInfiniteSet {
    int currentMin;
    HashSet<Integer> set;
    public SmallestInfiniteSet() {
        currentMin = 1;
        set = new HashSet<>();
    }
    
    public int popSmallest() {
        if(set.size() > 0){
            int min = Collections.min(set);
            set.remove(min);
            return min;
        }else{
            currentMin++;
            return currentMin-1;
        }
    }
    
    public void addBack(int num) {
        if(currentMin > num){
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */