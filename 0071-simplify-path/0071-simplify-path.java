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
       System.out.print(stack);

       while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
            sb.insert(0,"/");
       }

       return sb.toString();
    }
}