class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            temp /= 10;
        }

        int sum = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue() * entry.getKey();
            sum += val;
        }

        return sum;
    }
}