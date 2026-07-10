import java.util.*;
public class Remove_First {
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
    public static int size;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            size=0;
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }else{
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
    }
    public void print(){
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
        Remove_First ll=new Remove_First();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        System.out.println("Size before removing: "+size);
        ll.removeFirst();
        ll.print();
        System.out.println("Size after removing: "+size);
    }
}
