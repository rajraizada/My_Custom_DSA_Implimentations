package com.company.DataStructures;

public class CustomLinkedList {

    public static void main(String[] args) {

        CustomLinkedList LL = new CustomLinkedList();

        LL.insertLast(1);
        LL.insertLast(2);
        LL.insertLast(3);
        LL.insertLast(4);
        LL.insertLast(5);

        LL.delete(2);

        LL.display();



    }
//----------------------------------------------------------------------------------------------------------------------
//  CLASS NODE

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

//  VARIABLES
    private Node head;
    private Node tail;
    private int size;


//  CONSTRUCTOR
    public CustomLinkedList(){
        this.size=0;
    }


//  INSERTION

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;

        size++;
    }

    public void insert(int val, int index){
        if(size==0){
            insertFirst(val);
            return;
        }
        if(size==index){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next=node;

        size++;
    }


//  DELETION

    public void deleteFirst(){
        head=head.next;
        size--;
    }

    public void deleteLast(){
        Node temp=head;
        for (int i = 1; i <size-1 ; i++) {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size){
            deleteLast();
            return;
        }

        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }


//  DISPLAY

    public void display(){
        Node temp=head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

}
