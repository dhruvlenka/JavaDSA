package Tree;

public class SubtreeOfAnotherTree {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        //base case
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //base case
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        /*
        if root's values matched with subroot's values then we check
        subroot's left and subroot's right is matching or not.

         */
        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        //checking on the left of root and right of the root (values of subtree)
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
