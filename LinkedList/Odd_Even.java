import java.util.*;
public class Odd_Even {
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
    public static Node oddEven(Node head){
        if(head==null)
            return null;
        Node evenhead=null, oddhead=null;
        Node eventail=null, oddtail=null;
        Node curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                if(evenhead==null){
                    evenhead=eventail=curr;
                }else{
                    eventail.next=curr;
                    eventail=curr;
                }
            }
            else{
                if(oddhead==null){
                    oddhead=oddtail=curr;
                }else{
                    oddtail.next=curr;
                    oddtail=curr;
                }
            }curr=curr.next;
        }
        if(evenhead==null)
            return oddhead;
        eventail.next=oddhead;
        if(oddtail!=null)
            oddtail.next=null;
        return evenhead;
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
        Odd_Even ll=new Odd_Even();
        ll.addFirst(8);
        ll.addFirst(12);
        ll.addFirst(10);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        head=ll.oddEven(head);
        ll.print();
    }
}
