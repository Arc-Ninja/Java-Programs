package com.arc.main;

public class LL {
    Node head;
    class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
    }

    public void insertBegin(String data){
        Node nn = new Node(data);
        if (head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;

    }

    public void insertEnd(String data){
        Node nn = new Node(data);
        if (head == null){
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next = nn;

    }
    public void insertPos(int pos, String data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            System.out.println("Inserted at head positon coz list was empty");
            return;
        }
        Node temp = head;
        if(pos == 0) {
            head = nn;
            nn.next = temp;
            return;
        }
        while(pos>1 && temp.next != null){
            temp = temp.next;
            pos--;
        }
        if(pos!=0){
            Node temp1 = temp.next;
            temp.next = nn;
            nn.next = temp1;
        }
        else{
            temp.next = nn;
        }
    }
    public void delBeg(){
        if(head == null){
            System.out.println("Empty List!");
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }
    public void delEnd(){
        if(head == null){
            System.out.println("Empty List!");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printList(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
    LL list = new LL();
    list.insertBegin("Hello");
    list.insertBegin("34");
    list.insertEnd("World");
    list.insertPos(0,"!");
    list.insertPos(4,"test");
    list.insertEnd("Test2");
    list.delBeg();
    list.insertBegin("Test3");
    list.delEnd();
    list.printList();
    }
}
