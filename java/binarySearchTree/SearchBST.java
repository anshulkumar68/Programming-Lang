package binarySearchTree;
// package BINARY SEARCH TREE;

public class SearchBST {
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

    // Search the key
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) { // key found at root node
            return true;
        } else if (root.data > key) { // left subtree
            return search(root.left, key);
        } else {    // right subtree
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        // int values[] = {5, 1, 3, 4, 2, 7};
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root, 218)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }
}
