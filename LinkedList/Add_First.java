import java.util.*;
public class Add_First {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
        Node newNode=new Node(data);
            if(head==null){
            head=tail=newNode;
            return;
            }
            newNode.next=head;
            head=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Link list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Add_First ll=new Add_First();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

    }
}