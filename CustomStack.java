package com.company.DataStructures;

public class CustomStack extends Exception {
    public static void main(String[] args) throws Exception {

        CustomStack a = new CustomStack();

        a.insert(1);
        a.insert(3);
        a.insert(5);
        a.insert(7);
        a.insert(9);
        a.insert(11);
        a.insert(13);
        a.insert(15);
        a.insert(17);
        a.insert(19);
        a.insert(21);
        a.insert(23);
        a.insert(25);
        a.insert(27);
        a.insert(29);
        a.insert(31);


        a.display();
        System.out.println("STACK SIZE = "+a.SIZE);


    }

//======================================================================================================================

//  VARIABLES

    int [] data;
    static final int DEFAULT_SIZE=5;
    int POINTER=-1;
    int SIZE=0;

//  CONSTRUCTORS

    CustomStack(){
        this.data=new int[DEFAULT_SIZE];
    }

    CustomStack(int size){
        this.data=new int[size];
    }

//  FEATURES

//    INSERT
    void insert (int value){
        if(data.length==SIZE){
            int [] temp=new int[2*SIZE];

            for (int i = 0; i < SIZE; i++) {
                temp[i]= data[i];
            }

            data=temp;
        }

        data[++POINTER]=value;
        SIZE++;
    }

//    DELETE
    void delete() throws Exception{
        if(SIZE==0){
            throw new Exception("Stack is empty.");
        }

        POINTER--;
        SIZE--;
    }

//    DISPLAY
    void display(){
        for (int i = 0; i <SIZE; i++) {
            System.out.println(data[i]);
        }
    }
}
