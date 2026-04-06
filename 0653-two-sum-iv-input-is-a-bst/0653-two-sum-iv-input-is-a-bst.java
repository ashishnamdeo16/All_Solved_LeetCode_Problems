class Solution {
    public boolean findTarget(TreeNode root, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      return findFunc(root,k,map);    
    }
    public boolean findFunc(TreeNode root,int target,HashMap<Integer,Integer> map){
        if(root == null) return false;
        if(map.containsKey(target - root.val)){
            return true;
        }
        map.put(root.val,1);
        return findFunc(root.left, target, map) || findFunc(root.right, target, map);
    } 
}