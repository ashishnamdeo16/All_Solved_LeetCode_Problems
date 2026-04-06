class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        findK(root,k,pq);
        int val = pq.poll();
        return val;
    }

    public void findK(TreeNode root,int k,PriorityQueue<Integer> pq){
        if(root == null) return;
        
        pq.offer(root.val);
         if(pq.size() > k){
            pq.poll();
        }

        findK(root.left,k,pq);
        findK(root.right,k,pq);
       return;
    }
}