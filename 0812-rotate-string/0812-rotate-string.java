class Solution {
    public boolean rotateString(String s, String goal) { 
        if(s.length() != goal.length()) return false;
        String sum = s+s;
        return sum.contains(goal);
    }
}