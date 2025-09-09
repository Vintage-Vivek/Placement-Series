package AdvanceDSA.BinaryTree;

public class BuildTreePreOrder {

    static class Node{
        int data;
        Node left;
        Node right;
        
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes []) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        // No need to create object as it is a
        // Static class and you can access its
        // methods throughout the code without
        // making an object 

        // but even then you make a object then 
        // you can use it the second way

        Node root = tree.buildTree(nodes);

        // 2nd way
        // Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);
    }
}
