package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeRecap {
    static class Node {
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        //will return root node
        static int indx = -1;
        public static Node buildTree(int[] nodes){
            indx++;
            if(nodes[indx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    }else {
                        q.add(null);
                    }
                } else {
                    System.out.println(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    //function to count the nodes
    public static int countOfNodes(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    //sum of nodes
    public static int sumOfNodes(Node root){
        //base case
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    //height of a tree: root to deepest leaf (height)
    public static int height(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight)  + 1;
        return myHeight;
    }

    //Diameter of a tree: approach 1
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);

        int diameter3 = height(root.left) + height(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    //approach 2: calculating diameter and height together on each node
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
           return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(myHeight, myDiam);
    }

    //subtree of another tree

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);

        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);



    }
}
