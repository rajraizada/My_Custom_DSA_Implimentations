package com.company.DataStructures;

public class CustomQueue {
    public static void main(String[] args) throws Exception {

        CustomQueue a = new CustomQueue();

    }

//======================================================================================================================

//    VARIABLES
    int [] data;
    static final int DEFAULT_SIZE=5;
    int START=0;
    int END=0;
    int SIZE=0;


//    CONSTRUCTORS

    CustomQueue()
    {
        this.data=new int[DEFAULT_SIZE];
    }

    CustomQueue(int size)
    {
        this.data=new int[size];
    }

//    FEATURES

    void insert(int value)
    {
        if(SIZE==data.length){
            int [] temp = new int[2*SIZE];

            for (int i = 0; i < SIZE; i++) {
                temp[i]=data[i];
            }

            data=temp;
        }

        data[END++]=value;
        SIZE++;
    }

    void delete() throws Exception
    {
     if(SIZE==0){
         throw new Exception("Queue is empty");
     }

     for (int i = 0; i < SIZE-1; i++) {
            data[i]=data[i+1];
        }

     SIZE--;
     END--;
    }

    void display(){
        for (int i = 0; i < SIZE; i++) {
            System.out.println(data[i]);
        }
    }



}
