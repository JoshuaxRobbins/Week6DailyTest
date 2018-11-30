package com.example.josh.week6dailytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {




    public static void main(String[] args) {

            //Part1
//        mergeSort(0, list.length-1);
//        for(int i : list){
//            System.out.print(i + ", ");
//        }
            //Part2
//        Node node1 = new Node(null,null,10);
//        Node node2 = new Node(null,null,14);
//        Node node3 = new Node(node1,node2,18);
//        Node node4 = new Node(node3,null,21);
//        Tree tree = new Tree(node4);
//        tree.preOrder();

        //Part3 in LRU class

        //Part 4
//        int[][] array = new int[5][5];
//        for(int i = 0;i < 5;i++){
//            System.out.println();
//            for(int j = 0;j < 5;j++){
//                System.out.print((i+j) + " ");
//                array[i][j] = i + j;
//            }
//        }
//        SpiralArray spiralArray = new SpiralArray(array);
//        spiralArray.printSpiral();

        //Part 5
        Parenthesis parenthesis = new Parenthesis();
        System.out.println(parenthesis.testParenth("((){}{{{{}}{){}{}"));
    }

    public static void mergeSort(int left, int right){

        if(left < right){
            int center = left + ((right - left) / 2);
            mergeSort(left,center);
            mergeSort(center + 1,right);
            merge(left,center,right);

        }

    }

    public static void merge(int left, int center, int right){
        int[] list = {4,5,8,3,1,6,4,3,8,6,42,45,12};
        int[] temp = new int[list.length];
        for(int i = left; i <= right; i++){
            temp[i] = list[i];
        }
        int tempLeft = left;
        int tempCenter = center + 1;
        int tempRight = left;

        while(tempLeft <= center && tempCenter <= right){
            if(temp[tempLeft] <= temp[tempCenter]){
                list[tempRight] = temp[tempLeft];
                tempLeft++;
            }
            else{
                list[tempRight] = temp[tempCenter];
                tempCenter++;
            }
            tempRight++;
        }
        while(tempLeft <= center){
            list[tempRight] = temp[tempLeft];
            tempLeft++;
            tempRight++;

        }


    }




}
