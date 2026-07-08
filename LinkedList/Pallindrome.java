import java.util.*;
public class Pallindrome {
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
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean ispallindrome(){
        if(head==null||head.next==null){
            return true;
        }
        Node mid=findMid(head);
        
        Node prev=null;
        Node curr=mid;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;  Node right=prev;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        Pallindrome ll=new Pallindrome();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(1);
        ll.print();
        System.out.println(ispallindrome());
    }
}
