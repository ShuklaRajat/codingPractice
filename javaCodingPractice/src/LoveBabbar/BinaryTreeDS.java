package LoveBabbar;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDS {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
        public static void inOrder(Node root){
            if(root == null){
                return;
            }

            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }

        public static void levelOrderTraversal(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currNode  = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){
            if(root == null) {
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);

            return Math.max(left, right) + 1;
        }

        public static void main(String[] args) {
            int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

            BinaryTree bT = new BinaryTree();
            Node root = bT.buildTree(nodes);
//            System.out.println(root.left.right.data);
//            preOrder(root);
//            postOrder(root);
//            inOrder(root);
//            levelOrderTraversal(root);
            System.out.println(height(root));
        }
    }
}
