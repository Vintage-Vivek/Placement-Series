package AdvanceDSA.BinaryTree;

public class Q4_DiameterOfTree {
    
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

    public static int height(Node root) {
        if(root == null) return 0;

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight,rightheight)+1;
    }

    // Approach 1:- O(n^2)
    // public static int diameter(Node root) {
    //     if(root==null) return 0;

    //     int diam1 = diameter(root.left);
    //     int diam2 = diameter(root.right);
    //     int diam3 = height(root.left)+height(root.right)+1;

    //     return Math.max(diam1,Math.max(diam2,diam3));

    // }

    // Approach 2:- O(n)
    static class treeInfo {
        int height;
        int diam;
        treeInfo (int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    public static treeInfo diameter1(Node root) {

        if(root == null) return new treeInfo(0,0);

        treeInfo leftTI = diameter1(root.left);
        treeInfo rightTI = diameter1(root.right);

        int myHeight = Math.max(leftTI.height,rightTI.height)+1;

        int diam1 = leftTI.diam;
        int diam2 = rightTI.diam;
        int diam3 = leftTI.height+rightTI.height+1;

        int myDiam = Math.max(diam1,Math.max(diam2,diam3));

        return new treeInfo(myHeight, myDiam);
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(diameter1(root).diam);
 
    }

}
