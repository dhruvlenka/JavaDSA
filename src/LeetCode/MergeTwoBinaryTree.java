//Leetcode: 617
class MergeTree{
    int val;
    MergeTree left;
    MergeTree right;
    public MergeTree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class MergeTwoBinaryTree {
    public static void main(String[] args) {
        //first binary tree
        MergeTree root1= new MergeTree(1);
        root1.left = new MergeTree(3);
        root1.right = new MergeTree(2);
        root1.left.left = new MergeTree(5);

        //second binary tree
        MergeTree root2 = new MergeTree(2);
        root2.left = new MergeTree(1);
        root2.right = new MergeTree(3);
        root2.left.right = new MergeTree(4);
        root2.right.right = new MergeTree(7);

        //merge two binary tree
        MergeTree merged = merge(root1,root2);

        //printing
        System.out.println("Merged Binary Tree");
        printTree(merged);


    }
    public static MergeTree merge(MergeTree root1, MergeTree root2){
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        root1.val += root2.val;
        root1.left = merge(root1.left, root2.left);
        root1.right = merge(root1.right, root2.right);
        return root1;
    }
    public static void printTree(MergeTree node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }
}
