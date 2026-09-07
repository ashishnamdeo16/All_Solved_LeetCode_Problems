class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> fans = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int x : arr1){
            set.add(x);
        }

        for(int c : arr2){
            if(set.contains(c)){
                set2.add(c);
            }
        }

        for(int s : arr3){
            if(set2.contains(s)){
                fans.add(s);
            }
        }

        return fans;
    }
}