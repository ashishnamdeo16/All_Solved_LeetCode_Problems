class Solution {
    int levelCount = 1;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> newQueue = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        newQueue.offer(root);
        while(!newQueue.isEmpty()){
            int level = newQueue.size();
            List<Integer> children = new ArrayList<>(); 
            for(int i=0;i<level;i++){
                    if(newQueue.peek().left != null){
                        newQueue.offer(newQueue.peek().left);
                    }
                    if(newQueue.peek().right != null){
                         newQueue.offer(newQueue.peek().right);
                    }
                     children.add(newQueue.poll().val);
            }
            if (levelCount % 2 == 0) {
                Collections.reverse(children);
            }
            levelCount++;
            list.add(children);
            }
              return list;
        }
      
    }