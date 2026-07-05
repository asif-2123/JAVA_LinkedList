import java.util.*;
public class Intersection_ll {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node intersection(Node head1,Node head2){
        if(head1==null||head2==null)
            return null;

        Node a=head1;
        Node b=head2;
        while(a!=b){
            a=(a==null) ? head2 : a.next;
            b=(b==null) ? head1 : b.next;
        }
        return a;
    }
    public static void main(String[] args) {
        Node head1,head2;
        head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(9);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);
        head2=new Node(6);
        head2.next=new Node(7);
        head2.next.next=new Node(8);
        head2.next.next.next=head1.next.next;
        
        Node result=intersection(head1, head2);
        if(result!=null)
            System.out.println(result.data);
        else
            System.out.println("No intersection");
    }
}
