class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        int l = 1;
        while(l<s.length()){
            if(Character.toLowerCase(s.charAt(l)) !=  Character.toLowerCase(s.charAt(l-1))){
                count++;
            }
            l++;
        }

        return count;
    }
}