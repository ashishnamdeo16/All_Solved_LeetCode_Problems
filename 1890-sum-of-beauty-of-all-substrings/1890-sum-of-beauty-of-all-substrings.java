class Solution {
    public int beautySum(String s) {
        int totalBeauty =0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                int[] freq = new int[26];
                 String sub = s.substring(i,j);
                  for(int k=0;k<sub.length();k++){
                  freq[sub.charAt(k) - 'a']++;
            }
            int max = 0;
int min = Integer.MAX_VALUE;

for (int f : freq) {
    if (f > 0) {
        max = Math.max(max, f);
        min = Math.min(min, f);
    }
}
            int beauty = max-min;
            totalBeauty += beauty;
            }
        }
         return totalBeauty;
        }
         
        
}
