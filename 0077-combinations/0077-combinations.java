class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> finalans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findAllCombinations(1,finalans,temp,n,k);
        return finalans;
    }

    public void findAllCombinations(int idx,List<List<Integer>> finalans,List<Integer> temp,int n,int k){
        
        if(temp.size() == k){
            finalans.add(List.copyOf(temp));
            return;
        }

        if(idx > n) return;

        findAllCombinations(idx+1,finalans,temp,n,k);
        temp.add(idx);
        findAllCombinations(idx+1,finalans,temp,n,k);
        temp.remove(temp.size() - 1);
        return;
    }
}