package binaryTree;
// Number of nodes in the longest path between any 2 nodes

public class DiameterTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root) 
    {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = height(root.left);
        int diam3 = height(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    public static void main(String[] args) {
        int nodes[] = { 3, 4, 6, 3, -1, -1, -1, 1, 4, 6, -1, -1, -1, 2, -1, -1, 8, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        System.out.println(diameter(root));
    }
}
