import java.util.*;
public class Delete_Nodes {
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
        if(head==null){
            head=tail=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void deleteNodes(Node head,int M,int N){
        Node curr=head;
        while(curr!=null){
            for(int i=1;i<M && curr!=null;i++){
                curr=curr.next;
            }
            if(curr==null){
                return;
            }
            Node temp=curr.next;
            for(int i=1;i<=N && temp!=null;i++){
                temp=temp.next;
            }
            curr.next=temp;
            curr=temp;
        }  
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
        Delete_Nodes ll=new Delete_Nodes();
        ll.addFirst(8);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.print();
        deleteNodes(head,2,3);
        ll.print();
    }
}
