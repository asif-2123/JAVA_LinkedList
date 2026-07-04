import java.util.*;

import org.w3c.dom.Node;
public class Doubly_remove {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        newNode.prev=null;
        head=newNode;
    }
    public static void removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            return;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
    }
    public static void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            return;
        }    
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    public static void main(String[] args) {
        Doubly_remove ll=new Doubly_remove();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
