class TwoSum {
    List<Integer> list;

    public TwoSum() {
        this.list = new ArrayList<>();
    }
    
    public void add(int number) {
        list.add(number);
    }
    
    public boolean find(int value) {
        Collections.sort(list);
        int l = 0;
        int r = list.size() - 1;
        while(l < r){
            int sum = list.get(l) + list.get(r);
            if(sum == value){
                return true;
            }else if(sum > value){
                r--;
            }else{
                l++;
            }
        } 
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */