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
        return root;
    }

    static Node crateBST(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values to insert (-1 to stop):");
        int data = sc.nextInt();

        while (data != -1) {
            root = insertIntoBST(root, data);
            data = sc.nextInt();
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

    void preorder(Node root){
        if(root == null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    // min value of the BST
    static Node minvalue(Node root){
        if(root == null){
            System.out.println("No Min Value : ");
            return null;
        }
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    // search in BST
    boolean SearchInBST(Node root, int target){
        // base case
        if(root == null){
            return false;
        }
        if(root.data == target){
            return true;
        }

        // baki recursion
        boolean leftAns = false;
        boolean rightAns = false;
        if(target > root.data){
             rightAns = SearchInBST(root.right, target);
        }
        else {
            leftAns = SearchInBST(root.left, target);
        }

        return leftAns || rightAns;
    }
    public static void main(String args[]) {
        Node root = null;
        root = crateBST(root);

        BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
        System.out.println("Level Order Traversal:");
        bst.levelOrderTraversal(root);
        System.out.println("inorder : ");
        bst.inorder(root);
        System.out.println("preorder : ");
        bst.preorder(root);
        System.out.println("postorder : ");
        bst.postorder(root);

        Node minNode = minvalue(root);
        if(minNode == null){
            System.out.println("There is No Node in Tree : ");
        }
        else{
            System.out.println("Min Value is : " + minNode);
        }

    }
}
