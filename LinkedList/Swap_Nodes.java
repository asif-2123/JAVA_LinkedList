import java.util.*;
public class Swap_Nodes {
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
    public static void swapNodes(int X,int Y){
        Node prevX=null;
        Node currX=head;
        while(currX!=null){
            if(currX.data==X){
                break;
            }
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null;
        Node currY=head;
        while(currY!=null){
            if(currY.data==Y){
                break;
            }
            prevY=currY;
            currY=currY.next;
        }
        if(currX==null || currY==null){
            return;
        }
        if(prevX!=null){
            prevX.next=currY;
        }else{
            head=currY;
        }
        if(prevY!=null){
            prevY.next=currX;
        }else{
            head=currX;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
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
        Swap_Nodes ll=new Swap_Nodes();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        swapNodes(2,4);
        ll.print();
    }
}
