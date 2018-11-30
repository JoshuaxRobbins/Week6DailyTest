package com.example.josh.week6dailytest;

import java.util.Stack;

public class Tree {

    Node root;
    Node temp;

    public Tree(Node root) {
        this.root = root;
        this.temp = root;
    }

    public void preOrder(){

        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(temp);

        while(!nodeStack.empty()){
            temp = nodeStack.pop();
            System.out.print(temp.getData() + ", ");

            if(temp.right != null)
                nodeStack.push(temp.right);
            if(temp.left != null)
                nodeStack.push(temp.left);
        }

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
