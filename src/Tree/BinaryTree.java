package Tree;

//Representation of binary tree
class Tree {
    int data;
    Tree left;
    Tree right;

    //constructor
    public Tree(int data){
        //Assigning data to new node, setting left & right to null.
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
   Tree root;
    BinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Tree(1);
        tree.root.left = new Tree(2);
        tree.root.right = new Tree(3);
        tree.root.left.left = new Tree(4);
        tree.root.left.right = new Tree(5);
        tree.root.right.left = new Tree(6);
        tree.root.right.right = new Tree(7);

        //printing binary tree using the in-order traversal algorithm
        System.out.println("In-Order traversal algorithm: ");
        printInOrder(tree.root);
        System.out.println();

        //printing binary tree using pre-order traversal algorithm
        System.out.println("Pre-Order traversal algorithm: ");
        printPreOrder(tree.root);
        System.out.println();

        //printing binary tree using post-order traversal algorithm
        System.out.println("Post-order traversal algorithm: ");
        printPostOrder(tree.root);

    }
    public static void printInOrder(Tree node){
        if (node == null){
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data+ " ");
        printInOrder(node.right);
    }
    public static void printPreOrder(Tree node){
        if (node != null){
            System.out.println(node.data+ " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
    public static void printPostOrder(Tree node){
        if (node != null){
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.data+ " ");
        }
    }
}
