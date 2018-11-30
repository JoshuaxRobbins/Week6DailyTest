package com.example.josh.week6dailytest;

public class SpiralArray {


    int[][] array;

    public SpiralArray(int[][] array) {
        this.array = array;
    }


    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public void printSpiral(){
        System.out.println();
        int left = 0;
        int right = array.length - 1;
        int top = 0;
        int bottom = array[0].length - 1;
        while(top != bottom || left != right){

            printTop(left,right,top);
            top++;
            printRight(top,bottom,right);
            right--;
            printBottom(right,left,bottom);
            bottom--;
            printLeft(bottom,top,left);
            left++;
        }
        if(array.length % 2 != 0 && array[0].length % 2 != 0){
            int i = array.length/2;
            int j = array.length/2;
            System.out.println(array[i][j]);
        }


    }

    public void printTop(int start, int stop,int column){

        for(int i = start; i <= stop;i++){
            System.out.print(array[i][column]);
        }
    }
    public void printBottom(int start, int stop,int column){

        for(int i = start; i >= stop;i--){
            System.out.print(array[i][column]);
        }
    }
    public void printRight(int start, int stop,int row){

        for(int i = start; i <= stop;i++){
            System.out.print(array[row][i]);
        }
    }
    public void printLeft(int start, int stop,int row){

        for(int i = start; i >= stop;i--){
            System.out.print(array[row][i]);
        }
    }


}
