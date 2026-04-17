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
        

        for(int i=0;i<words1.length;i++){
            for(int j=0;j<words2.length;j++){
                if(words1[i].equals(words2[j])){
                        if(arr.get(words1[i]) == 1 && arr2.get(words2[j]) == 1){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}