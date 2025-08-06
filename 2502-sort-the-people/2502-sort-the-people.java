class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> details = new HashMap<>();
        String[] sortedNames = new String[names.length];
        for(int i=0;i<heights.length;i++){
            details.put(heights[i],names[i]);
        }

        for(int j=0;j<heights.length-1;j++){
            int minIndex = j;
            for(int k=j+1;k<heights.length;k++){
                if(heights[k] > heights[minIndex]){
                    minIndex = k;
                }
            }
            int temp = heights[j];
            heights[j]= heights[minIndex];
            heights[minIndex] = temp;
        }
        
        for(int n=0;n<heights.length;n++){
            sortedNames[n] = details.get(heights[n]);
        }
        return sortedNames;
    }
}