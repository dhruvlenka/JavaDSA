class TREENode {
    int val;
    TREENode left;
    TREENode right;
    public TREENode (int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class RangeSumOfBST {
    public static void main(String[] args) {
        TREENode root = new TREENode(10);
        root.left = new TREENode(5);
        root.right = new TREENode(15);
        root.left.left = new TREENode(3);
        root.left.right = new TREENode(7);
        root.right.right = new TREENode(18);

        RangeSumOfBST ans = new RangeSumOfBST();
        int sum = ans.rangeSumBST(root,7,15);
        System.out.println(sum);
    }
    public int rangeSumBST(TREENode root, int low, int high){
        if(root == null){
            return 0;
        }
        if (root.val < low){
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high){
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
