package com.example.josh.week6dailytest;

import android.annotation.SuppressLint;

import java.util.HashMap;

public class LRU {

    Node head;
    Node end;
    @SuppressLint("UseSparseArrays")
    HashMap<Integer,Node> hashMap;
    private Node temp;


    public int getData(int data){

        Node temp = hashMap.get(data);
        if (temp != null){
            setNewHead(temp);
            return temp.getData();
        }
        else{
            return -1;
        }
    }
    public int setData(int data){
        temp = new Node(null,head,data);
        head.setLeft(temp);
        head = temp;
        end = end.getLeft();
        end.getRight().setLeft(null);
        end.setRight(null);
        return head.getData();
    }

    public void setNewHead(Node newHead){

        newHead.getLeft().setRight(newHead.getRight());
        head.setLeft(newHead);
        newHead.setRight(head);
        newHead.setLeft(null);
        head = newHead;
        end = end.getLeft();
        end.getRight().setLeft(null);
        end.setRight(null);
    }


















    public HashMap<Integer, Node> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Integer, Node> hashMap) {
        this.hashMap = hashMap;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public LRU(Node head, Node end, HashMap<Integer, Node> hashMap) {
        this.head = head;
        this.end = end;
        this.hashMap = hashMap;
    }
}
