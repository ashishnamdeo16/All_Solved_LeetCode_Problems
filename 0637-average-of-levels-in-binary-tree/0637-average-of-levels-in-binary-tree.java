class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> finalList = new ArrayList<>();
        Queue<TreeNode> newQueue = new ArrayDeque<>();
        if(root == null) return finalList;
        newQueue.offer(root);
        while(!newQueue.isEmpty()){
            int len = newQueue.size();
            double sum = 0.0;
            for(int i=0;i<len;i++){
                if(newQueue.peek().left != null){
                    newQueue.offer(newQueue.peek().left );
                }
                if(newQueue.peek().right != null){
                    newQueue.offer(newQueue.peek().right);
                }
                sum += (double) newQueue.poll().val;
            }
            finalList.add(sum/len);
        }
        return finalList;
    }

}