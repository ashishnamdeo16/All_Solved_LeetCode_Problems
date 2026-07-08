class Solution {
    public int countOddLetters(int n) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");

        StringBuilder sb = new StringBuilder();
        int num = n;
        while(num > 0){
            int rem = num%10;
            sb.insert(0,map.get(rem));
            num = num/10;
        }

        int[] freq = new int[26];
        for(char s : sb.toString().toCharArray()){
            freq[s - 'a']++;
        }

        int count = 0;
        for(int x : freq){
            if(x%2 != 0){
                count++;
            }
        }
        return count;
    }
}