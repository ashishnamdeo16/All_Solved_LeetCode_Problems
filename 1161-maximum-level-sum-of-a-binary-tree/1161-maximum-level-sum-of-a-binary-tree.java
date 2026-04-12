class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        long prevSum = Long.MIN_VALUE;
        int level = 1;
        int resLevel = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            long sum = 0;
            for(int i=0;i<size;i++){
                TreeNode p = queue.poll();
                if(p.left != null){
                    queue.offer(p.left);
                }
                if(p.right != null){
                    queue.offer(p.right);
                }
                sum += p.val;
            }

            if(sum > prevSum){
                prevSum = sum;
                resLevel = level;
            }
            
            level++;
        }

        return resLevel;
    }
}