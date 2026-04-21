class Solution {
    public int minOperations(String[] logs) {
        Stack<String> mainfolder = new Stack<>();

        for(String s : logs){
            if(s.equals("../")){
                if(!mainfolder.isEmpty()){
                    mainfolder.pop();
                }
            }else if(s.equals("./")){
                continue;
            }else{
                mainfolder.push(s);
            }
        }

        return mainfolder.size();
    }
}