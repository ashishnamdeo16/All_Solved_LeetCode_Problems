class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        while(right < fruits.length){   
            set.add(fruits[right]);
            if(set.size() > 2){
                set.remove(fruits[left]);
                left++;
            }

            max = Math.max(max,right - left + 1);
            right++;
        }
        return max;
    }
}