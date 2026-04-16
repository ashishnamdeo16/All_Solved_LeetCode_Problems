class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr = new int[10];
        Arrays.fill(arr,0);
        
        while(n > 0){
            int rem = n%10;
            arr[rem]++;
            n /= 10;    
        }
        int min = Integer.MAX_VALUE;
        int val = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && arr[i] < min){
                min = arr[i];
                val = i;
            }

        }

        return val;
    }
}