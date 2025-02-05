package Tree;

import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

class treeNODE {
    int data;
    treeNODE left;
    treeNODE right;

    public treeNODE(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Tree(10);
        tree.root.left = new Tree(20);
        tree.root.right = new Tree(30);
        tree.root.left.left = new Tree(40);
        tree.root.left.right = new Tree(50);
        tree.root.right.left = new Tree(60);
        tree.root.right.right = new Tree(70);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        List<List<Integer>> result = levelOrderTraversal.levelOrder(tree.root);
        System.out.println("Level Order Traversal of Binary Tree: ");
        for (List<Integer> level: result){
            System.out.println(level);
        }
    }

    public List<List<Integer>> levelOrder(Tree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Tree curr = queue.poll();
                level.add(curr.data);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            result.add(level);
        }

        return result;
    }
}
