class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] < nums2[j][0]){
                map.put(nums1[i][0],nums1[i][1]);
                i++;
            }else if(nums1[i][0] > nums2[j][0]){
                map.put(nums2[j][0],nums2[j][1]);
                j++;
            }else if(nums1[i][0] == nums2[j][0]){
                map.put(nums1[i][0],nums1[i][1] + nums2[j][1]);
                i++;
                j++;
            }
        }
        while(i < nums1.length){
            map.put(nums1[i][0],nums1[i][1]);
            i++;
        }
        while(j < nums2.length){
            map.put(nums2[j][0],nums2[j][1]);
            j++;
        }

        int[][] finalArray = new int[map.size()][2];
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            finalArray[k][0] = entry.getKey();
            finalArray[k][1] = entry.getValue();
            k++;
        }
        return finalArray;
     }
}