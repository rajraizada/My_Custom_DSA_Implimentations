package com.company.DataStructures;

public class CustomCircularQueue {
    public static void main(String[] args) throws Exception {

        CustomCircularQueue a = new CustomCircularQueue();

        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);

//        a.delete();
//        a.insert(6);

        a.display();

    }

//======================================================================================================================

    //    VARIABLES
    int [] data;
    static final int DEFAULT_SIZE=5;
    int START=0;
    int END=0;
    int SIZE=0;


//    CONSTRUCTORS

    CustomCircularQueue()
    {
        this.data=new int[DEFAULT_SIZE];
    }

    CustomCircularQueue(int size)
    {
        this.data=new int[size];
    }

//    FEATURES

    void insert(int value)
    {
//        if(SIZE==data.length){
//            int [] temp = new int[2*SIZE];
//
//            for (int i = 0; i < SIZE; i++) {
//                temp[i]=data[i];
//            }
//
//            data=temp;
//        }

        END=END % data.length;
        data[END++]=value;
        SIZE++;
    }

    void delete() throws Exception
    {
        if(SIZE==0){
            throw new Exception("Queue is empty");
        }

        START=++START%data.length;
        SIZE--;
    }

    void display(){
        for (int i = START; i == END; i=++i%data.length) {
            System.out.println(data[i]);
        }
    }

}
