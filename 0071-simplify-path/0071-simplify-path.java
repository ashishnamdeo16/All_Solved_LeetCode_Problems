class Solution {
    public String simplifyPath(String path) {
       String[] s = path.split("/");
       Stack<String> stack = new Stack<>();

       for(String x : s){
        if(!stack.isEmpty()){
            if(x.equals("") || x.equals(".")){
                continue;
            }else if(x.equals("..")){
                stack.pop();
            }else{
                stack.push(x);
            }
        }else if(!x.equals("") && !x.equals("..") && !x.equals(".")){
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