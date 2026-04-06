
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> finalAns = new ArrayList<>();
       List<Integer> arr = new ArrayList<>();
       int sum = 0;
       findAllPaths(root,targetSum,sum,arr,finalAns);
       return finalAns;
    }

    public void findAllPaths(TreeNode root,int targetSum,int sum,List<Integer> temp,List<List<Integer>>  finalAns){

        if(root == null){
            return;
        }

        sum += root.val;
        temp.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == targetSum){
                finalAns.add(List.copyOf(temp));
            }
        }

        findAllPaths(root.left,targetSum,sum,temp,finalAns);
        findAllPaths(root.right,targetSum,sum,temp,finalAns);
        temp.remove(temp.size() - 1);
    }
}