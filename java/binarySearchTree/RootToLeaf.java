package binarySearchTree;
import java.util.*;

public class RootToLeaf {
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

    // Print Root to Leaf node
    public static void root2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        //leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{       // non-leaf
        root2Leaf(root.left, path);
        root2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    // print path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
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

        root2Leaf(root, new ArrayList<>());
    }
}
