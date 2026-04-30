class Solution {
    public String simplifyPath(String path) {
       String[] s = path.split("/");
       Stack<String> stack = new Stack<>();

       for(String x : s){
            if(x.equals("") || x.equals(".")){
                continue;
            }else if(x.equals("..")){
                if(!stack.isEmpty()) {
                 stack.pop();
                }
            }else{
                stack.push(x);
            }
        }

        if(stack.isEmpty()) return "/";

       StringBuilder sb = new StringBuilder();

       for (String dir : stack) {
          sb.append("/").append(dir);
       }

       return sb.toString();
    }
}