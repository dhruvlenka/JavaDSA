//LeetCode: 2236
class BinaryTree {
    int val;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class RootEqualsSumofChildren {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(4);
        root.right = new BinaryTree(6);
        //Way1
        boolean result = checkTree(root, root.left, root.right);
        System.out.println(result);
        //Way2
        boolean result2 = checkTree2(root);
        System.out.println(result2);
        //Way3
        boolean result3 = checkTree3(root);
        System.out.println(result3);


    }
    public static boolean checkTree (BinaryTree root, BinaryTree left, BinaryTree right){
       int equalsToRoot = left.val + right.val;
        if (root == null){
            return true;
        }
        if (equalsToRoot == root.val) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean checkTree2(BinaryTree root){
        if(root.val == root.left.val + root.right.val){
            return true;
        }
        return false;
    }
    public static boolean checkTree3(BinaryTree root){
        return root.val == root.left.val + root.right.val;
    }
}
