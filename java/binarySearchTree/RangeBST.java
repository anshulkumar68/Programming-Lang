package binarySearchTree;
public class RangeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            // this.left;
            // this.right;
        }
    }

    // inserting node in BT
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // inorder for verifying the BST
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Print node in given range
    public static void Range(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            Range(root.left, X, Y);
            System.out.print(root.data+" ");
            Range(root.right, X, Y);
        }
        else if(root.data >= Y){
            Range(root.right, X, Y);
        }
        else{
            Range(root.left, X, Y);
        }
    } 
    public static void main(String[] args) {
        // int values[] = {5, 1, 3, 4, 2, 7};
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        Range(root,4 , 10);
    }
}
