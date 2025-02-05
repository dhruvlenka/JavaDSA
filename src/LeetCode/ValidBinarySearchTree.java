
//LeetCode: 98
class Tree {
    int data;
    Tree left;
    Tree right;

    public Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ValidBinarySearchTree {
    public static void main(String[] args) {
        ValidBinarySearchTree validate = new ValidBinarySearchTree();

        Tree root = new Tree(2);
        root.left = new Tree(1);
        root.right = new Tree(3);
        System.out.println(validate.isValidBST(root));

        Tree root2 = new Tree(5);
        root2.left = new Tree(1);
        root2.right = new Tree(4);
        root2.right.left = new Tree(3);
        root2.right.right = new Tree(6);
        System.out.println(validate.isValidBST(root2));
    }
    public static boolean isValid (Tree root, Integer left, Integer right){
        //base case
        if(root == null){
            return true;
        }
        // checking if the current node's value is within the range of min and max values
        if ((left != null && root.data <= left) || (right != null && root.data >= right)) {
            return false;
        }

        // checking if the left and right subtrees are valid BSTs
        return isValid(root.left, left, root.data) && isValid(root.right, root.data, right);
    }
    public boolean isValidBST(Tree root){
        return isValid(root, null, null);
    }
}
