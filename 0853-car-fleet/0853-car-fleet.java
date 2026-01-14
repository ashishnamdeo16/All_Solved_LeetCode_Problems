class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<position.length;i++){
            List<Integer> combine = new ArrayList<>();
            combine.add(position[i]);
            combine.add(speed[i]);
            arr.add(combine);
        }
       Collections.sort(arr, (a, b) -> b.get(0) - a.get(0));
       double[] time = new double[arr.size()];
       for(int j=0;j<arr.size();j++){
            time[j] = (double)(target - arr.get(j).get(0))/arr.get(j).get(1);
       }
       double lastFleetime = 0;
       int count = 0;
       for(int k=0;k<time.length;k++){
            if(k== 0){
                count = 1; 
                lastFleetime = time[k]; 
            }else if(time[k] > lastFleetime){
                count++;
                lastFleetime = time[k];
            }
            
       }
        return count;
    }
}