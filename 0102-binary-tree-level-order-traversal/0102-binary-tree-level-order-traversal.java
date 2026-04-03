class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> pq = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        pq.offer(root);

        while(!pq.isEmpty()){
            int levelSize = pq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode node = pq.poll();
                temp.add(node.val);
                if(node.left != null){
                    pq.offer(node.left);
                }
                if(node.right != null){
                    pq.offer(node.right);
                }
            }   
        ans.add(temp);
        }
        return ans;
    }
}