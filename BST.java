// Binary search tree

public class BST {
        static class Node {
            public int data;
            public Node left;
            public Node right;
    
            public Node(int data)
            {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        public Node root;
    
        public BST() {
            this.root = null;
        }

        void inorder() {
            inorderDisplay(root);            
        }

        void inorderDisplay(Node root) {
            if(root != null) {
                inorderDisplay(root.left);
                System.out.println(root.data);
                inorderDisplay(root.right);
            }
        }
        
        public static void main(String[] args)
        {
            BST bst = new BST();
            bst.root = new Node(11);
            bst.root.left = new Node(9);
            bst.root.right = new Node(12);
            bst.root.left.left = new Node(8);
            bst.root.left.right = new Node(10);
            bst.inorder();
        }     
}