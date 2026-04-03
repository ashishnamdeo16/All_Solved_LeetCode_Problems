class Solution {
    int levelCount = 1;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> pq = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        pq.offer(root);
        while(!pq.isEmpty()){
            int size = pq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode p = pq.poll();
                temp.add(p.val);
                
                    if(p.left != null){
                        pq.offer(p.left);
                    }
                    if(p.right != null){
                        pq.offer(p.right);
                    }
            }
            if(levelCount%2 == 0){
                Collections.reverse(temp);
            }
            levelCount++;
            ans.add(temp);
        }
        return ans;
    }  
}