package binarySearchTree;

public class BuildBST 
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            // this.left;
            // this.right;
        }
    }
    //inserting node in BT
    public static Node insert(Node root, int val)
    {
        if(root == null){
            root = new Node(val);
            return root;
        }  
        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

   // inorder for verifying the BST
   public static void inorder(Node root)
   {
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
   }

    public static void main(String[] args) 
    {
        // int values[] = {5, 1, 3, 4, 2, 7};
        int values[] = {8, 3, 5, 6, 9, 1, 4, 2};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}
