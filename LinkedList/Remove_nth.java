import java.util.*;
public class Remove_nth {
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
    public static void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void deleteNth(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=0; int toFind=sz-n; Node prev=head;
        while(i<toFind-1){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void print(){
        if(head==null){
            System.out.println("LL is empty");
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
        Remove_nth ll=new Remove_nth();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.deleteNth(2);
        ll.print();
    }
}
