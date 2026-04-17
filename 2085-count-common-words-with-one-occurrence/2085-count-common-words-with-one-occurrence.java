class Solution {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String,Integer> arr = new HashMap<>();
        HashMap<String,Integer> arr2 = new HashMap<>();

        for(String x : words1){
            arr.put(x,arr.getOrDefault(x,0)+1);
        }
        for(String x : words2){
            arr2.put(x,arr2.getOrDefault(x,0)+1);
        }

        int count = 0;
        

        for(String word : arr.keySet()){
            if(arr.get(word) == 1 && arr2.getOrDefault(word, 0) == 1){
                count++;
            }
        }
        
        return count;
    }
}