class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> finalList = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        getAllPossible(0,0,n,temp,finalList);
        return finalList;
    }
    public void getAllPossible(int open,int close,int n, StringBuilder temp,List<String> finalList){
        if(open == n && close == n){
            finalList.add(temp.toString());
            return;
        }

        if(open < n){
            temp.append('(');
            getAllPossible(open+1,close,n,temp,finalList);
            temp.deleteCharAt(temp.length() - 1);
        }

        if(close < open){
            temp.append(')');
            getAllPossible(open,close+1,n,temp,finalList);
            temp.deleteCharAt(temp.length() - 1);
        }

        return;
    }
}