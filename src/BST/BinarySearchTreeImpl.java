package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTreeImpl {

    static Node insertIntoBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // if not the first node
        if (data > root.data) {
            root.right = insertIntoBST(root.right, data);
        } else {
            root.left = insertIntoBST(root.left, data);
        }
        return root; // <-- missing return for the recursive update
    }

    static Node crateBST(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values to insert (-1 to stop):");
        int data = sc.nextInt();

        while (data != -1) {
            root = insertIntoBST(root, data); // <-- store updated root
            data = sc.nextInt();              // <-- read next value
        }
        return root;
    }

    void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();

            if (temp == null) {
                System.out.println(); // new level
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void main(String args[]) {
        Node root = null;
        root = crateBST(root); // <-- must assign the returned root

        BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
        System.out.println("Level Order Traversal:");
        bst.levelOrderTraversal(root);
    }
}
