package BianryTree;

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

public class ImpBinaryTree {

    // Method to create tree and return root node
    static Node createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        // Step 1: create node
        Node newNode = new Node(data);

        // Step 2: create left subtree
        System.out.println("left of Node : " + newNode.data);
        newNode.left = createTree();
        // Step 3: create right subtree
        System.out.println("right of Node : " + newNode.data);
        newNode.right = createTree();

        return newNode;
    }

    static void preOrderTraversal(Node root){

        //base case
        if(root == null){
            return;
        }

        // N L R

        // for current node
        System.out.println(root.data + " ");

        // L
        preOrderTraversal(root.left);

        // R
        preOrderTraversal(root.right);
    }


    void inorderTraversal(Node root){

        if(root == null){
            return;
        }

        // L
        inorderTraversal(root.left);
        // N
        System.out.println(root.data + " ");
        // R
        inorderTraversal(root.right);
    }

    void postOrderTraversal(Node root){

        if(root == null){
            return;
        }

        // L
        preOrderTraversal(root.left);
        // R
        preOrderTraversal(root.right);
        // N
        System.out.println(root.data + " ");
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Binary tree created successfully.");

        preOrderTraversal(root);
    }
}
