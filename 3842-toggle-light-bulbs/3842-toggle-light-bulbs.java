class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> arr = new ArrayList<>();
        int[] arrButton = new int[100];
        for(int x : bulbs){
            if(arrButton[x-1] == 0){
                arrButton[x-1] = 1;
            }else{
                arrButton[x-1] = 0;
            }
        }

        for(int i=0;i<100;i++){
            if(arrButton[i] == 1){
                arr.add(i+1);
            }
        }
        return arr;
    }
}